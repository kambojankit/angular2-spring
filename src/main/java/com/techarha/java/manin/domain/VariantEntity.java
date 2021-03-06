package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 15/11/15.
 */
@Entity
@Table(name = "variant", schema = "", catalog = "manin")
public class VariantEntity {
    private int id;
    private int productId;
    private String thumbnailUri;
    private String imageUri;
    private String color;
    private String createdAt;
    private int createdBy;
    private String sku;
    private int priceId;
    private int size;
    private int weight;
    private int capacity;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "thumbnail_uri")
    public String getThumbnailUri() {
        return thumbnailUri;
    }

    public void setThumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
    }

    @Basic
    @Column(name = "image_uri")
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "created_by")
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "sku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Basic
    @Column(name = "price_id")
    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    @Basic
    @Column(name = "size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "weight")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "capacity")
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VariantEntity that = (VariantEntity) o;

        if (id != that.id) return false;
        if (productId != that.productId) return false;
        if (createdBy != that.createdBy) return false;
        if (priceId != that.priceId) return false;
        if (size != that.size) return false;
        if (weight != that.weight) return false;
        if (capacity != that.capacity) return false;
        if (thumbnailUri != null ? !thumbnailUri.equals(that.thumbnailUri) : that.thumbnailUri != null) return false;
        if (imageUri != null ? !imageUri.equals(that.imageUri) : that.imageUri != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + productId;
        result = 31 * result + (thumbnailUri != null ? thumbnailUri.hashCode() : 0);
        result = 31 * result + (imageUri != null ? imageUri.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + priceId;
        result = 31 * result + size;
        result = 31 * result + weight;
        result = 31 * result + capacity;
        return result;
    }
}
