package com.productsearch.java.model;

/**@ClassName-ProductRating
 *@Method-All the getter and setter for the constraints
 *@Objective-To set and get the value
 *@param-string,integer
 *@ReturnType- Integer ,String
 *@author SajalJain
 * 
 */

public class ProductRating {
	int productRatingId;
	 int productRating;
	 int productRatingType;
	/**
	 * @return the productRatingId
	 */
	public int getProductRatingId() {
		return productRatingId;
	}
	/**
	 * @param productRatingId the productRatingId to set
	 */
	public void setProductRatingId(int productRatingId) {
		this.productRatingId = productRatingId;
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
	 * @return the productRatingType
	 */
	public int getProductRatingType() {
		return productRatingType;
	}
	/**
	 * @param productRatingType the productRatingType to set
	 */
	public void setProductRatingType(int productRatingType) {
		this.productRatingType = productRatingType;
	}

}
