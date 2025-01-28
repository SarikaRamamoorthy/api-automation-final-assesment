package org.testing.responsePojo.productDetails;

import java.util.List;

public class DataItemResponse {
    private String productName;
    private String itemName;
    private String itemCode;
    private double packageWeight;
    private int productItemWidth;
    private int productItemLength;
    private int productItemHeight;
	private String blibliSku;
    private String productSku;
    private String categoryName;
    private String categoryCode;
    private int totalStock;
    private int totalReservedStock;
    private int totalUnsellableStock;
	private double sellingUnitPrice;
	private String productDetailPage;
    private int proposedQuantity;
    private String imageUrl;
	private boolean isProductFbb;
	private String sellerProductDetailPage;
    private boolean isDisabled;
	private String errorMessage;
	private String halalStatus;
    private List<String> categoryHierarchy;

	public void setBlibliSku(String blibliSku){
		this.blibliSku = blibliSku;
	}

	public String getBlibliSku(){
		return blibliSku;
	}

	public void setProductItemWidth(int productItemWidth){
		this.productItemWidth = productItemWidth;
	}

	public int getProductItemWidth(){
		return productItemWidth;
	}

	public void setSellingUnitPrice(double sellingUnitPrice){
		this.sellingUnitPrice = sellingUnitPrice;
	}

	public double getSellingUnitPrice(){
		return sellingUnitPrice;
	}

	public void setProductDetailPage(String productDetailPage){
		this.productDetailPage = productDetailPage;
	}

	public String getProductDetailPage(){
		return productDetailPage;
	}

	public void setCategoryHierarchy(List<String> categoryHierarchy){
		this.categoryHierarchy = categoryHierarchy;
	}

	public List<String> getCategoryHierarchy(){
		return categoryHierarchy;
	}

	public void setPackageWeight(double packageWeight){
		this.packageWeight = packageWeight;
	}

	public double getPackageWeight(){
		return packageWeight;
	}

	public void setIsProductFbb(boolean isProductFbb){
		this.isProductFbb = isProductFbb;
	}

	public boolean isIsProductFbb(){
		return isProductFbb;
	}

	public void setItemCode(String itemCode){
		this.itemCode = itemCode;
	}

	public String getItemCode(){
		return itemCode;
	}

	public void setTotalUnsellableStock(int totalUnsellableStock){
		this.totalUnsellableStock = totalUnsellableStock;
	}

	public int getTotalUnsellableStock(){
		return totalUnsellableStock;
	}

	public void setSellerProductDetailPage(String sellerProductDetailPage){
		this.sellerProductDetailPage = sellerProductDetailPage;
	}

	public String getSellerProductDetailPage(){
		return sellerProductDetailPage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setCategoryCode(String categoryCode){
		this.categoryCode = categoryCode;
	}

	public String getCategoryCode(){
		return categoryCode;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setProductItemLength(int productItemLength){
		this.productItemLength = productItemLength;
	}

	public int getProductItemLength(){
		return productItemLength;
	}

	public void setProposedQuantity(int proposedQuantity){
		this.proposedQuantity = proposedQuantity;
	}

	public int getProposedQuantity(){
		return proposedQuantity;
	}

	public void setHalalStatus(String halalStatus){
		this.halalStatus = halalStatus;
	}

	public String getHalalStatus(){
		return halalStatus;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemName(){
		return itemName;
	}

	public void setProductSku(String productSku){
		this.productSku = productSku;
	}

	public String getProductSku(){
		return productSku;
	}

	public void setTotalReservedStock(int totalReservedStock){
		this.totalReservedStock = totalReservedStock;
	}

	public int getTotalReservedStock(){
		return totalReservedStock;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setProductItemHeight(int productItemHeight){
		this.productItemHeight = productItemHeight;
	}

	public int getProductItemHeight(){
		return productItemHeight;
	}

	public void setTotalStock(int totalStock){
		this.totalStock = totalStock;
	}

	public int getTotalStock(){
		return totalStock;
	}

	public void setIsDisabled(boolean isDisabled){
		this.isDisabled = isDisabled;
	}

	public boolean isIsDisabled(){
		return isDisabled;
	}
}