package com.techarha.java.manin.business.impl;

import com.techarha.java.manin.business.FlipkartPaymentsManager;
import com.techarha.java.manin.dao.FlipkartOrdersDao;
import com.techarha.java.manin.dao.FlipkartTransDao;
import com.techarha.java.manin.domain.FlipkartOrderEntity;
import com.techarha.java.manin.domain.FlipkartTransEntity;
import com.techarha.java.manin.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by ankit on 18/11/15.
 */
@Component("flipkartPaymentsManager")
public class FlipkartPaymentsManagerImpl implements FlipkartPaymentsManager {

    @Autowired
    @Qualifier("flipkartTransDao")
    private FlipkartTransDao flipkartTransDao;

    @Autowired
    @Qualifier("flipkartOrdersDao")
    private FlipkartOrdersDao flipkartOrdersDao;


    @Override
    public FlipkartPaymentsResponse getPaymentDetails() {
        FlipkartPaymentsResponse flipkartPaymentsResponse = new FlipkartPaymentsResponse();


        List<FlipkartTransEntity> flipkartTransEntities =  flipkartTransDao.getAllTrasactionDetails();

        for(FlipkartTransEntity entity : flipkartTransEntities){
            FlipkartPaymentsResponse.TransactionDetails transactionDetails = new FlipkartPaymentsResponse.TransactionDetails();
            mapTransData(transactionDetails, entity);
            flipkartPaymentsResponse.getTransactionDetails().add(transactionDetails);
        }


        return flipkartPaymentsResponse;
    }

    @Override
    public FlipkartOrdersResponse getOrderDetails() {
        FlipkartOrdersResponse flipkartOrdersResponse = new FlipkartOrdersResponse();
        List<FlipkartOrderEntity> flipkartOrderEntities =  flipkartOrdersDao.getAllOrdersDetails();

        for(FlipkartOrderEntity entity : flipkartOrderEntities){
            FlipkartOrdersResponse.OrderDetails orderDetails = new FlipkartOrdersResponse.OrderDetails();
            mapOrdersData(orderDetails, entity);
            flipkartOrdersResponse.getOrderDetails().add(orderDetails);
        }


        return flipkartOrdersResponse;
    }

    @Override
    public FlipkartSettlements getSettlementData() {

        FlipkartSettlements flipkartSettlements = new FlipkartSettlements();

        List<FlipkartOrderEntity> flipkartOrderEntities =  flipkartOrdersDao.getAllOrdersDetails();
        List<FlipkartTransEntity> flipkartTransEntities =  flipkartTransDao.getAllTrasactionDetails();

        for (FlipkartOrderEntity flipkartOrderEntity : flipkartOrderEntities){
            FlipkartSettlements.Settlements settlements = new FlipkartSettlements.Settlements();
            OrderData orderData = new OrderData();

            orderData.setOrderId(flipkartOrderEntity.getOrderId());
            orderData.setOrderType(flipkartOrderEntity.getOrderType());
            orderData.setSkuCode(flipkartOrderEntity.getSkuCode());
            orderData.setInvoiceAmount(Double.parseDouble(flipkartOrderEntity.getInvoiceAmount()));
            orderData.setInvoiceNo(flipkartOrderEntity.getInvoiceNo());
            orderData.setInvoiceDate(convertToGregorian(flipkartOrderEntity.getInvoiceDate()));
            orderData.setOrderState(flipkartOrderEntity.getOrderState());
            orderData.setQuantity(Integer.parseInt(flipkartOrderEntity.getQuantity()));
            orderData.setSellingPricePerItem(Double.parseDouble(flipkartOrderEntity.getSellingPricePerItem()));
            orderData.setShippingChargePerItem(Double.parseDouble(flipkartOrderEntity.getShippingChargePerItem()));
            orderData.setShipmentStatus(flipkartOrderEntity.getShipmentStatus());
            orderData.setTotalAmount(Double.parseDouble(flipkartOrderEntity.getTotalAmount()));

            for(FlipkartTransEntity transEntity : flipkartTransEntities){
                if(transEntity.getOrderId().equals(orderData.getOrderId())){
                    TransData transData = new TransData();

                    transData.setSettlementRefNo(transEntity.getSettlementRefNo());

                    transData.setCancellationDate(convertToGregorian(transEntity.getCancellationDate()));
                    transData.setDeliveryDate(convertToGregorian(transEntity.getDeliveryDate()));
                    transData.setDispatchDate(convertToGregorian(transEntity.getDispatchDate()));
                    transData.setInvoiceDate(convertToGregorian(transEntity.getInvoiceDate()));
                    transData.setSettlementDate(convertToGregorian(transEntity.getSettlementDate()));

                    transData.setInvoiceId(transEntity.getInvoiceId());
                    transData.setOrderStatus(transEntity.getOrderStatus());
                    transData.setOrderType(transEntity.getOrderType());
                    transData.setQuantity(transEntity.getQuantity());

                    FlipkartPricing flipkartPricing = new FlipkartPricing();

                    flipkartPricing.setOrderItemValue(Double.parseDouble(transEntity.getOrderItemValue()));
                    flipkartPricing.setSaleTransactionAmount(Double.parseDouble(transEntity.getSaleTransactionAmount()));
                    flipkartPricing.setDiscountTransactionAmount(Double.parseDouble(transEntity.getDiscountTransactionAmount()));
                    flipkartPricing.setRefund(Double.parseDouble(transEntity.getRefund()));
                    flipkartPricing.setProtectionFund(Double.parseDouble(transEntity.getProtectionFund()));
                    flipkartPricing.setTotalMarketplaceFee(Double.parseDouble(transEntity.getMarketplaceFee()));
                    flipkartPricing.setServiceTax(Double.parseDouble(transEntity.getServiceTax()));
                    flipkartPricing.setSettlementValue(Double.parseDouble(transEntity.getSettlementValue()));
                    flipkartPricing.setCommissionRate(Double.parseDouble(transEntity.getCommissionRate()));
                    flipkartPricing.setCommission(Double.parseDouble(transEntity.getCommissionAmount()));
                    flipkartPricing.setPaymentRate(Double.parseDouble(transEntity.getPaymentRate()));
                    flipkartPricing.setPaymentFee(Double.parseDouble(transEntity.getPaymentFee()));
                    flipkartPricing.setFeeDiscount(Double.parseDouble(transEntity.getFeeDiscount()));
                    flipkartPricing.setCancellationFee(Double.parseDouble(transEntity.getCancellationFee()));
                    flipkartPricing.setFixedFee(Double.parseDouble(transEntity.getFixedFee()));
                    flipkartPricing.setEmiFee(Double.parseDouble(transEntity.getEmiFee()));
                    flipkartPricing.setTotalWeight(Double.parseDouble(transEntity.getTotalWeight()));
                    flipkartPricing.setShippingFee(Double.parseDouble(transEntity.getShippingFee()));
                    flipkartPricing.setReverseShippingFee(Double.parseDouble(transEntity.getReverseShippingFee()));
                    flipkartPricing.setShippingZone(transEntity.getShippingZone());
                    flipkartPricing.setPaymentFee(Double.parseDouble(transEntity.getPaymentFee()));
                    flipkartPricing.setTotalOffer(Double.parseDouble(transEntity.getTotalOfferAmount()));
                    flipkartPricing.setFlipkartOffer(Double.parseDouble(transEntity.getFlipkartOfferShare()));
                    flipkartPricing.setMyShareOffer(Double.parseDouble(transEntity.getMyOfferShare()));

                    transData.setOrderPricing(flipkartPricing);

                    settlements.getTransData().add(transData);

                }
            }

            settlements.setOrderData(orderData);
            flipkartSettlements.getSettlements().add(settlements);
        }

        return flipkartSettlements;
    }

    private void mapOrdersData(FlipkartOrdersResponse.OrderDetails orderDetails, FlipkartOrderEntity entity){
        orderDetails.setOrderedOn(entity.getOrderedOn());
        orderDetails.setProductName(entity.getProductName());
        orderDetails.setFsn(entity.getFsn());
        orderDetails.setHasOffer(entity.getHasOffer());
        orderDetails.setOrderId(entity.getOrderId());
        orderDetails.setPrimaryOrderItemId(entity.getPrimaryOrderItemId());
        orderDetails.setOrderItemId(entity.getOrderItemId());
        orderDetails.setOrderType(entity.getOrderType());
        orderDetails.setSkuCode(entity.getSkuCode());
        orderDetails.setOrderState(entity.getOrderState());
        orderDetails.setSellingPricePerItem(Double.parseDouble(entity.getSellingPricePerItem()));

        orderDetails.setOctroiFeePerItem(Double.parseDouble(entity.getOctroiFeePerItem()));
        orderDetails.setEmiFeePerItem(Double.parseDouble(entity.getEmiFeePerItem()));
        orderDetails.setQuantity(Integer.parseInt(entity.getQuantity()));
        orderDetails.setTotalAmount(Double.parseDouble(entity.getTotalAmount()));
        orderDetails.setInvoiceNo(entity.getInvoiceNo());
        orderDetails.setInvoiceAmount(Double.parseDouble(entity.getInvoiceAmount()));
        orderDetails.setInvoiceDate(convertToGregorian(entity.getInvoiceDate()));
        orderDetails.setVatExclusiveOthersTax(Double.parseDouble(entity.getVatExclusiveOthersTax()));
        orderDetails.setBuyerName(entity.getBuyerName());
        orderDetails.setShipToName(entity.getShipToName());
        orderDetails.setAddressLine1(entity.getAddressLine1());
        orderDetails.setAddressLine2(entity.getAddressLine2());
        orderDetails.setCity(entity.getCity());
        orderDetails.setState(entity.getState());
        orderDetails.setPincode(entity.getPincode());
        orderDetails.setProcSla(entity.getProcSla());
        orderDetails.setDispatchAfterDate(convertToGregorian(entity.getDispatchAfterDate()));
        orderDetails.setRtdDate(convertToGregorian(entity.getRtdDate()));
        orderDetails.setFormRequired(entity.getFormRequired());
        orderDetails.setShipmentWeight(Double.parseDouble((null == entity.getShipmentWeight() || "".equals(entity.getShipmentWeight()))? "0":entity.getShipmentWeight()));
        orderDetails.setShipmentStatus(entity.getShipmentStatus());
        orderDetails.setTrackingId(entity.getTrackingId());
        orderDetails.setSellerBuyerInvoiceNo(entity.getSellerBuyerInvoiceNo());
        orderDetails.setImei(entity.getImei());
        orderDetails.setReturnDisputeTickets(entity.getReturnDisputeTickets());
    }

    private void mapTransData(FlipkartPaymentsResponse.TransactionDetails trans, FlipkartTransEntity entity){
        trans.setOrderId(entity.getOrderId());
        trans.setOrderItemId(entity.getOrderItemId());
        trans.setFSN(entity.getFsn());
        trans.setOrderDate(convertToGregorian(entity.getOrderDate()));
        trans.setInvoiceDate(convertToGregorian(entity.getInvoiceDate()));
        trans.setDispatch(convertToGregorian(entity.getDispatchDate()));
        trans.setShipDate(convertToGregorian(entity.getDispatchDate()));
        trans.setDeliveryDate(convertToGregorian(entity.getDeliveryDate()));
        trans.setCancellationDate(convertToGregorian(entity.getCancellationDate()));
        trans.setSettlementDate(convertToGregorian(entity.getSettlementDate()));
        trans.setOrderState(entity.getOrderStatus());
        trans.setOrderStatusTrans(entity.getOrderStatus());
        trans.setProductName(entity.getSellerSku());
        trans.setSKU(entity.getSellerSku());
        trans.setSellingPrice(Double.parseDouble(entity.getShippingFee()));
        trans.setShippingCharges(Double.parseDouble(entity.getShippingFee()));
        trans.setTotalInvoiceAmount(Double.parseDouble(entity.getInvoiceAmount()));
        trans.setSettlementRefNo(entity.getSettlementRefNo());
        trans.setOrderType(entity.getOrderType());

        FlipkartPricing flipkartPricing = new FlipkartPricing();

        flipkartPricing.setOrderItemValue(Double.parseDouble(entity.getOrderItemValue()));
        flipkartPricing.setSaleTransactionAmount(Double.parseDouble(entity.getSaleTransactionAmount()));
        flipkartPricing.setDiscountTransactionAmount(Double.parseDouble(entity.getDiscountTransactionAmount()));
        flipkartPricing.setRefund(Double.parseDouble(entity.getRefund()));
        flipkartPricing.setProtectionFund(Double.parseDouble(entity.getProtectionFund()));
        flipkartPricing.setTotalMarketplaceFee(Double.parseDouble(entity.getMarketplaceFee()));
        flipkartPricing.setServiceTax(Double.parseDouble(entity.getServiceTax()));
        flipkartPricing.setSettlementValue(Double.parseDouble(entity.getSettlementValue()));
        flipkartPricing.setCommissionRate(Double.parseDouble(entity.getCommissionRate()));
        flipkartPricing.setCommission(Double.parseDouble(entity.getCommissionAmount()));
        flipkartPricing.setPaymentRate(Double.parseDouble(entity.getPaymentRate()));
        flipkartPricing.setPaymentFee(Double.parseDouble(entity.getPaymentFee()));
        flipkartPricing.setFeeDiscount(Double.parseDouble(entity.getFeeDiscount()));
        flipkartPricing.setCancellationFee(Double.parseDouble(entity.getCancellationFee()));
        flipkartPricing.setFixedFee(Double.parseDouble(entity.getFixedFee()));
        flipkartPricing.setEmiFee(Double.parseDouble(entity.getEmiFee()));
        flipkartPricing.setTotalWeight(Double.parseDouble(entity.getTotalWeight()));
        flipkartPricing.setShippingFee(Double.parseDouble(entity.getShippingFee()));
        flipkartPricing.setReverseShippingFee(Double.parseDouble(entity.getReverseShippingFee()));
        flipkartPricing.setShippingZone(entity.getShippingZone());
        flipkartPricing.setPaymentFee(Double.parseDouble(entity.getPaymentFee()));
        flipkartPricing.setTotalOffer(Double.parseDouble(entity.getTotalOfferAmount()));
        flipkartPricing.setFlipkartOffer(Double.parseDouble(entity.getFlipkartOfferShare()));
        flipkartPricing.setMyShareOffer(Double.parseDouble(entity.getMyOfferShare()));

        trans.setOrderPricing(flipkartPricing);


    }

    private XMLGregorianCalendar convertToGregorian(String date){
        XMLGregorianCalendar xmlDate2 = null;
        try {
            Date holderDate=null;
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            holderDate=df.parse( date);
            GregorianCalendar cal = new GregorianCalendar();

            cal.setTime(holderDate);
            xmlDate2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), holderDate.getHours(),holderDate.getMinutes(),holderDate.getSeconds(), DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG).normalize();

        } catch (ParseException e) {
            System.out.println("error parsing date: "+ date+" returning: "+xmlDate2);
        } catch (DatatypeConfigurationException e) {
            System.out.println("error parsing date: " + date + " returning: " + xmlDate2);
        }
        return xmlDate2;
    }
}
