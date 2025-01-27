package org.testing.requestPojo.draft;

import java.util.List;

public class SelectedProductRequest {
    private String categoryName;
    private String categoryCode;
    private String blibliSku;
    private String itemCode;
    private String itemName;
    private double packageWeight;
    private Integer recommendedQuantity;
    private String recommendedQuantityErrorCode;
    private int proposedQuantity;
    private Integer confirmedQuantity;
    private int productItemLength;
    private int productItemHeight;
    private int productItemWidth;
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

    public int getProductItemLength() {
        return productItemLength;
    }

    public void setProductItemLength(int productItemLength) {
        this.productItemLength = productItemLength;
    }

    public int getProductItemHeight() {
        return productItemHeight;
    }

    public void setProductItemHeight(int productItemHeight) {
        this.productItemHeight = productItemHeight;
    }

    public int getProductItemWidth() {
        return productItemWidth;
    }

    public void setProductItemWidth(int productItemWidth) {
        this.productItemWidth = productItemWidth;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public List<String> getCategoryHierarchy() {
        return categoryHierarchy;
    }

    public void setCategoryHierarchy(List<String> categoryHierarchy) {
        this.categoryHierarchy = categoryHierarchy;
    }

    public Integer getRecommendedQuantity() {
        return recommendedQuantity;
    }

    public void setRecommendedQuantity(Integer recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
    }

    public String getRecommendedQuantityErrorCode() {
        return recommendedQuantityErrorCode;
    }

    public void setRecommendedQuantityErrorCode(String recommendedQuantityErrorCode) {
        this.recommendedQuantityErrorCode = recommendedQuantityErrorCode;
    }

    public int getProposedQuantity() {
        return proposedQuantity;
    }

    public void setProposedQuantity(int proposedQuantity) {
        this.proposedQuantity = proposedQuantity;
    }

    public Integer getConfirmedQuantity() {
        return confirmedQuantity;
    }

    public void setConfirmedQuantity(Integer confirmedQuantity) {
        this.confirmedQuantity = confirmedQuantity;
    }
}
