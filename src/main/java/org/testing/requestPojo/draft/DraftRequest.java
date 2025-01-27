package org.testing.requestPojo.draft;

import java.util.List;
import java.util.Map;

public class DraftRequest {
    private String merchantCode;
    private String merchantName;
    private String userType;
    private String regionCode;
    private String regionName;
    private String draftStatus;

    private Map<String, SelectedProductRequest> selectedProducts;
    private List<String> addedProducts;
    private List<String> removedProducts;
    private List<String> notEligibleInAnyWarehouse;
    private List<String> newNotEligibleInAnyWarehouse;
    private List<String> notAllocatedProducts;

    private List<WarehouseAllocationRequest> warehouseAllocations;
    private List<ShippingDetailsRequest> shippingDetails;



    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getDraftStatus() {
        return draftStatus;
    }

    public void setDraftStatus(String draftStatus) {
        this.draftStatus = draftStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public Map<String, SelectedProductRequest> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(Map<String, SelectedProductRequest> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public void setShippingDetails(List<ShippingDetailsRequest> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public List<ShippingDetailsRequest> getShippingDetails() {
        return shippingDetails;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<String> getAddedProducts() {
        return addedProducts;
    }

    public void setAddedProducts(List<String> addedProducts) {
        this.addedProducts = addedProducts;
    }

    public List<String> getRemovedProducts() {
        return removedProducts;
    }

    public void setRemovedProducts(List<String> removedProducts) {
        this.removedProducts = removedProducts;
    }

    public List<String> getNotEligibleInAnyWarehouse() {
        return notEligibleInAnyWarehouse;
    }

    public void setNotEligibleInAnyWarehouse(List<String> notEligibleInAnyWarehouse) {
        this.notEligibleInAnyWarehouse = notEligibleInAnyWarehouse;
    }

    public List<String> getNewNotEligibleInAnyWarehouse() {
        return newNotEligibleInAnyWarehouse;
    }

    public void setNewNotEligibleInAnyWarehouse(List<String> newNotEligibleInAnyWarehouse) {
        this.newNotEligibleInAnyWarehouse = newNotEligibleInAnyWarehouse;
    }

    public List<String> getNotAllocatedProducts() {
        return notAllocatedProducts;
    }

    public void setNotAllocatedProducts(List<String> notAllocatedProducts) {
        this.notAllocatedProducts = notAllocatedProducts;
    }

    public List<WarehouseAllocationRequest> getWarehouseAllocations() {
        return warehouseAllocations;
    }

    public void setWarehouseAllocations(List<WarehouseAllocationRequest> warehouseAllocations) {
        this.warehouseAllocations = warehouseAllocations;
    }
}
