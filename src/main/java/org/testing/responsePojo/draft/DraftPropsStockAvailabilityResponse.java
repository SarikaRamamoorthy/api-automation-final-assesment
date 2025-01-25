package org.testing.responsePojo.draft;

public class DraftPropsStockAvailabilityResponse {
    private String warehouseCode;
    private String warehouseName;
    private boolean distribution;
    private long proposedQuantity;
    private long availableQuantity;
    private long confirmedQuantity;
    private String sellerNotes;

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

    public boolean isDistribution() {
        return distribution;
    }

    public void setDistribution(boolean distribution) {
        this.distribution = distribution;
    }

    public long getProposedQuantity() {
        return proposedQuantity;
    }

    public void setProposedQuantity(long proposedQuantity) {
        this.proposedQuantity = proposedQuantity;
    }

    public long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public long getConfirmedQuantity() {
        return confirmedQuantity;
    }

    public void setConfirmedQuantity(long confirmedQuantity) {
        this.confirmedQuantity = confirmedQuantity;
    }

    public String getSellerNotes() {
        return sellerNotes;
    }

    public void setSellerNotes(String sellerNotes) {
        this.sellerNotes = sellerNotes;
    }

}
