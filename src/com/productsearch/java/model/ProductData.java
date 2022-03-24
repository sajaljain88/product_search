package com.productsearch.java.model;

/**@ClassName-ProductData
 *@Method-All the getter and setter for the Entities
 *@Objective-To set and get the value
 *@param-string,integer
 *@ReturnType- Integer ,String
 *@author SajalJain
 * 
 */
public class ProductData {
private int productId;
private String productName;
private int productPrice;
private String productBrandName;
private String productDescription;
private int productRating;
private int productDiscount;
private int shippingPrice;
/**
 * @return the productId
 */
public int getProductId() {
	return productId;
}
/**
 * @param productId the productId to set
 */
public void setProductId(int productId) {
	this.productId = productId;
}
/**
 * @return the productName
 */
public String getProductName() {
	return productName;
}
/**
 * @param productName the productName to set
 */
public void setProductName(String productName) {
	this.productName = productName;
}
/**
 * @return the productPrice
 */
public int getProductPrice() {
	return productPrice;
}
/**
 * @param productPrice the productPrice to set
 */
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
/**
 * @return the productBrandName
 */
public String getProductBrandName() {
	return productBrandName;
}
/**
 * @param productBrandName the productBrandName to set
 */
public void setProductBrandName(String productBrandName) {
	this.productBrandName = productBrandName;
}
/**
 * @return the productDescription
 */
public String getProductDescription() {
	return productDescription;
}
/**
 * @param productDescription the productDescription to set
 */
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
/**
 * @return the productRating
 */
public int getProductRating() {
	return productRating;
}
/**
 * @param productRating the productRating to set
 */
public void setProductRating(int productRating) {
	this.productRating = productRating;
}
/**
 * @return the productDiscount
 */
public int getProductDiscount() {
	return productDiscount;
}
/**
 * @param productDiscount the productDiscount to set
 */
public void setProductDiscount(int productDiscount) {
	this.productDiscount = productDiscount;
}
/**
 * @return the shippingPrice
 */
public int getShippingPrice() {
	return shippingPrice;
}
/**
 * @param shippingPrice the shippingPrice to set
 */
public void setShippingPrice(int shippingPrice) {
	this.shippingPrice = shippingPrice;
}

}
