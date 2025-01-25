package org.testing.requestPojo.draft;

import java.util.List;
import java.util.Map;

public class DraftRequest {
    private String draftNumber;
    private String merchantCode;
    private String merchantName;
    private String draftStatus;
    private String userType;
    private long potentialOutboundFee;
    private String deliveryNotes;
    private Map<String, DraftPropsRequest> selectedProducts;
    private List<DraftShippingDetailsRequest> shippingDetails;

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

    public Map<String, DraftPropsRequest> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(Map<String, DraftPropsRequest> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Map<String, DraftShippingDetailsRequest> getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(List<DraftShippingDetailsRequest> shippingDetails) {
        this.shippingDetails = shippingDetails;
    }
}
