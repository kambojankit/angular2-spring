package com.techarha.java.manin.business.impl;

import com.techarha.java.manin.business.FlipkartPaymentsManager;
import com.techarha.java.manin.dao.FlipkartOrdersDao;
import com.techarha.java.manin.dao.FlipkartTransDao;
import com.techarha.java.manin.domain.FlipkartOrderEntity;
import com.techarha.java.manin.domain.FlipkartTransEntity;
import com.techarha.java.manin.response.FlipkartOrdersResponse;
import com.techarha.java.manin.response.FlipkartPaymentsResponse;
import com.techarha.java.manin.response.FlipkartPricing;
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
