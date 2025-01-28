package org.testing.responsePojo.draft;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SelectedProduct {
    private String blibliSku;
    private String itemCode;
    private String itemName;
    private String productSku;
    private String categoryCode;
    private String categoryName;
    private int proposedQuantity;
    private int recommendedQuantity;
    private int confirmedQuantity;
    private double productItemLength;
    private double productItemHeight;
    private double productItemWidth;
    private double packageWeight;
    private String productDetailPage;
    private String imageUrl;
    @JsonProperty("isProductFbb")
    private boolean isProductFbb;
    private String sellerProductDetailPage;
    private String recommendedQuantityErrorCode;
    private int totalStock;
    private int totalReservedStock;
    private int totalUnsellableStock;
    private String halalStatus;
    private String storageLocation;
    private List<String> categoryHierarchy;

    public String getBlibliSku() {
        return blibliSku;
    }

    public void setBlibliSku(String blibliSku) {
        this.blibliSku = blibliSku;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProposedQuantity() {
        return proposedQuantity;
    }

    public void setProposedQuantity(int proposedQuantity) {
        this.proposedQuantity = proposedQuantity;
    }

    public int getRecommendedQuantity() {
        return recommendedQuantity;
    }

    public void setRecommendedQuantity(int recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
    }

    public int getConfirmedQuantity() {
        return confirmedQuantity;
    }

    public void setConfirmedQuantity(int confirmedQuantity) {
        this.confirmedQuantity = confirmedQuantity;
    }

    public double getProductItemLength() {
        return productItemLength;
    }

    public void setProductItemLength(double productItemLength) {
        this.productItemLength = productItemLength;
    }

    public double getProductItemHeight() {
        return productItemHeight;
    }

    public void setProductItemHeight(double productItemHeight) {
        this.productItemHeight = productItemHeight;
    }

    public double getProductItemWidth() {
        return productItemWidth;
    }

    public void setProductItemWidth(double productItemWidth) {
        this.productItemWidth = productItemWidth;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getProductDetailPage() {
        return productDetailPage;
    }

    public void setProductDetailPage(String productDetailPage) {
        this.productDetailPage = productDetailPage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isProductFbb() {
        return isProductFbb;
    }

    public void setProductFbb(boolean productFbb) {
        this.isProductFbb = productFbb;
    }

    public String getSellerProductDetailPage() {
        return sellerProductDetailPage;
    }

    public void setSellerProductDetailPage(String sellerProductDetailPage) {
        this.sellerProductDetailPage = sellerProductDetailPage;
    }

    public String getRecommendedQuantityErrorCode() {
        return recommendedQuantityErrorCode;
    }

    public void setRecommendedQuantityErrorCode(String recommendedQuantityErrorCode) {
        this.recommendedQuantityErrorCode = recommendedQuantityErrorCode;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getTotalReservedStock() {
        return totalReservedStock;
    }

    public void setTotalReservedStock(int totalReservedStock) {
        this.totalReservedStock = totalReservedStock;
    }

    public int getTotalUnsellableStock() {
        return totalUnsellableStock;
    }

    public void setTotalUnsellableStock(int totalUnsellableStock) {
        this.totalUnsellableStock = totalUnsellableStock;
    }

    public String getHalalStatus() {
        return halalStatus;
    }

    public void setHalalStatus(String halalStatus) {
        this.halalStatus = halalStatus;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public List<String> getCategoryHierarchy() {
        return categoryHierarchy;
    }

    public void setCategoryHierarchy(List<String> categoryHierarchy) {
        this.categoryHierarchy = categoryHierarchy;
    }
}
