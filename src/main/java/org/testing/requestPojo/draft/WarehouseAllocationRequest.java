package org.testing.requestPojo.draft;

import java.util.List;

public class WarehouseAllocationRequest {
    private String warehouseCode;
    private String warehouseName;
    private String warehouseAddress;
    private int warehouseRank;
    private List<String> selectedProducts;

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

    public int getWarehouseRank() {
        return warehouseRank;
    }

    public void setWarehouseRank(int warehouseRank) {
        this.warehouseRank = warehouseRank;
    }

    public List<String> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<String> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
}
