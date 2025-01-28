package org.testing.responsePojo.draft;

import java.util.List;
import java.util.Map;

public class Data {
    private String draftNumber;
    private String merchantCode;
    private String merchantName;
    private String draftStatus;
    private String regionCode;
    private String regionName;
    private String userType;
    private boolean unpaidBills;
    private Map<String, SelectedProduct> selectedProducts;
    private List<String> notAllocatedProducts;
    private List<String> notEligibleInAnyWarehouse;
    private List<WarehouseAllocation> warehouseAllocations;
    private List<ShippingDetail> shippingDetails;

    public String getDraftNumber() {
        return draftNumber;
    }

    public void setDraftNumber(String draftNumber) {
        this.draftNumber = draftNumber;
    }

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isUnpaidBills() {
        return unpaidBills;
    }

    public void setUnpaidBills(boolean unpaidBills) {
        this.unpaidBills = unpaidBills;
    }

    public Map<String, SelectedProduct> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(Map<String, SelectedProduct> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public List<String> getNotAllocatedProducts() {
        return notAllocatedProducts;
    }

    public void setNotAllocatedProducts(List<String> notAllocatedProducts) {
        this.notAllocatedProducts = notAllocatedProducts;
    }

    public List<String> getNotEligibleInAnyWarehouse() {
        return notEligibleInAnyWarehouse;
    }

    public void setNotEligibleInAnyWarehouse(List<String> notEligibleInAnyWarehouse) {
        this.notEligibleInAnyWarehouse = notEligibleInAnyWarehouse;
    }

    public List<WarehouseAllocation> getWarehouseAllocations() {
        return warehouseAllocations;
    }

    public void setWarehouseAllocations(List<WarehouseAllocation> warehouseAllocations) {
        this.warehouseAllocations = warehouseAllocations;
    }

    public List<ShippingDetail> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(List<ShippingDetail> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

}
