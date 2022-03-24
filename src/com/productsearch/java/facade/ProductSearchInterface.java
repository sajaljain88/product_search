/**
 * 
 */
package com.productsearch.java.facade;

import java.util.List;

import com.productsearch.java.model.ProductData;

/**
 * 
 * @author SajalJain
 *
 */
public interface ProductSearchInterface {

	/* OBJECTIVE- To search a product By using a keyword
     * METHOD:- getProductByKeyword()
     * PARAM:-  String keyword ,String sortBy
     * RETURN OBJECT:- List<ProductData> */
	
	List<ProductData> getProductByKeyword( String keyword);
/*
 *   OBJECTIVE - To sort products based on rating.             
 *   METHOD:- SortProductsByRating()
 *   PARAM:-  Integer rating, string ProductName;
 *   RETURN OBJECT:List<ProductData>
 */
	List<ProductData> sortProductsByRating(int rating );
	
/* 
 *    OBJECTIVE : to sort the product based on discount
 *    METHOD : sortProductByDiscount()
 *    PARAM- string product name, Integer discount  ,Integer choice
 *    RETURN OBJECT :- List<ProductData>

 */
    List<ProductData>sortProductByDiscount(int productDiscount);
    	 
    /*
     *    OBJECTIVE :  to sort the product based on shipping price
     *    METHOD : sortProductByShippingPrice()
     *    PARAM- string product name,Integer  shippingPrice  , Integer choice
     *    RETURN OBJECT :- List<ProductData>
     * 
     */
	List<ProductData>sortProductByShippingPrice(int productShippingPrice);
	
	/* 
	 *  OBJECTIVE : to sort the product based on price
	 *  METHOD : sortProductByPrice()
	 *  PARAM- String product name, Integer price
	 *  RETURN OBJECT :- List<ProductData> 
	 */
	List<ProductData>sortProductByPrice(int productPrice);
	



 



   

}
