package org.testing.responsePojo.draft;

import java.util.List;

public class ShippingDetail {
    private String warehouseCode;
    private String warehouseName;
    private String warehouseAddress;
    private String shippingType;
    private String pickupPointCode;
    private String pickupPointName;
    private String pickupPointAddress;
    private String sellerPicName;
    private String sellerPicPhoneNumber;
    private String emergencyContactEmail;
    private String emergencyContactNumber;
    private List<String> preferredTimeSchedules;

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getPickupPointCode() {
        return pickupPointCode;
    }

    public void setPickupPointCode(String pickupPointCode) {
        this.pickupPointCode = pickupPointCode;
    }

    public String getPickupPointName() {
        return pickupPointName;
    }

    public void setPickupPointName(String pickupPointName) {
        this.pickupPointName = pickupPointName;
    }

    public String getPickupPointAddress() {
        return pickupPointAddress;
    }

    public void setPickupPointAddress(String pickupPointAddress) {
        this.pickupPointAddress = pickupPointAddress;
    }

    public String getSellerPicName() {
        return sellerPicName;
    }

    public void setSellerPicName(String sellerPicName) {
        this.sellerPicName = sellerPicName;
    }

    public String getSellerPicPhoneNumber() {
        return sellerPicPhoneNumber;
    }

    public void setSellerPicPhoneNumber(String sellerPicPhoneNumber) {
        this.sellerPicPhoneNumber = sellerPicPhoneNumber;
    }

    public String getEmergencyContactEmail() {
        return emergencyContactEmail;
    }

    public void setEmergencyContactEmail(String emergencyContactEmail) {
        this.emergencyContactEmail = emergencyContactEmail;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public List<String> getPreferredTimeSchedules() {
        return preferredTimeSchedules;
    }

    public void setPreferredTimeSchedules(List<String> preferredTimeSchedules) {
        this.preferredTimeSchedules = preferredTimeSchedules;
    }
}
