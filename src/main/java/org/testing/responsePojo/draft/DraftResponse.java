package org.testing.responsePojo.draft;

import java.util.List;
import java.util.Map;

public class DraftResponse {
    private String draftNumber;
    private String merchantCode;
    private String merchantName;
    private String draftStatus;
    private String userType;
    private long potentialOutboundFee;
    private String deliveryNotes;
    private Map<String, DraftPropsResponse> selectedProducts;
    private List<DraftShippingDetailsResponse> shippingDetails;

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public long getPotentialOutboundFee() {
        return potentialOutboundFee;
    }

    public void setPotentialOutboundFee(long potentialOutboundFee) {
        this.potentialOutboundFee = potentialOutboundFee;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }

    public Map<String, DraftPropsResponse> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(Map<String, DraftPropsResponse> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Map<String, DraftShippingDetailsResponse> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(List<DraftShippingDetailsResponse> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }
}
