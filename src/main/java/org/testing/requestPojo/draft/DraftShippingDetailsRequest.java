package org.testing.requestPojo.draft;

import java.util.List;

public class DraftShippingDetailsRequest {
    private String warehouseCode;
    private String warehouseName;
    private String shippingType; // SHIPPED_BY_BLIBLI (DEFAULT VALUE)
    private String pickupPointCode;
    private String pickupPointName;
    private String pickupPointAddress;
    private String sellerPicName;
    private String sellerPicPhoneNumber;
    private String emergencyContactEmail;
    private String emergencyContactNumber;
    private List<DraftTimeSchedulesRequest> preferredTimeSchedules;

    public List<DraftTimeSchedulesRequest> getPreferredTimeSchedules() {
        return preferredTimeSchedules;
    }

    public void setPreferredTimeSchedules(List<DraftTimeSchedulesRequest> preferredTimeSchedules) {
        this.preferredTimeSchedules = preferredTimeSchedules;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getEmergencyContactEmail() {
        return emergencyContactEmail;
    }

    public void setEmergencyContactEmail(String emergencyContactEmail) {
        this.emergencyContactEmail = emergencyContactEmail;
    }

    public String getSellerPicPhoneNumber() {
        return sellerPicPhoneNumber;
    }

    public void setSellerPicPhoneNumber(String sellerPicPhoneNumber) {
        this.sellerPicPhoneNumber = sellerPicPhoneNumber;
    }

    public String getSellerPicName() {
        return sellerPicName;
    }

    public void setSellerPicName(String sellerPicName) {
        this.sellerPicName = sellerPicName;
    }

    public String getPickupPointAddress() {
        return pickupPointAddress;
    }

    public void setPickupPointAddress(String pickupPointAddress) {
        this.pickupPointAddress = pickupPointAddress;
    }

    public String getPickupPointName() {
        return pickupPointName;
    }

    public void setPickupPointName(String pickupPointName) {
        this.pickupPointName = pickupPointName;
    }

    public String getPickupPointCode() {
        return pickupPointCode;
    }

    public void setPickupPointCode(String pickupPointCode) {
        this.pickupPointCode = pickupPointCode;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

}
