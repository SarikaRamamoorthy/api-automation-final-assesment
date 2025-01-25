package org.testing.responsePojo.draft;

import java.util.List;

public class DraftPropsResponse {
    private String blibliSku; //common
    private String itemCode;//common
    private String itemName;//common
    private String productCode;
    private String productSku;//common
    private String categoryCode;//common
    private String categoryName;//common
    private double productItemLength;//common
    private double productItemHeight;//common
    private double productItemWidth;//common
    private double packageWeight;//common
    private String productDetailPage;//common
    private String imageUrl;
    private boolean isProductFbb;
    private String sellerProductDetailPage;
    private boolean isDisabled;
    private String errorMessage;
    private String halalStatus;
    private String storageLocation;
    private List<String> categoryHierarchy;
    private List<DraftPropsStockAvailabilityResponse> stockAvailability;

    public List<DraftPropsStockAvailabilityResponse> getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(List<DraftPropsStockAvailabilityResponse> stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
        isProductFbb = productFbb;
    }

    public String getSellerProductDetailPage() {
        return sellerProductDetailPage;
    }

    public void setSellerProductDetailPage(String sellerProductDetailPage) {
        this.sellerProductDetailPage = sellerProductDetailPage;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
