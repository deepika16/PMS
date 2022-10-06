/**
 * 
 */
package com.yash.pms.dao;

import com.yash.pms.exceptions.ProductAlreadyExistException;
import com.yash.pms.exceptions.ProductDoesNotExistException;
import com.yash.pms.exceptions.ProductNotFoundException;
import com.yash.pms.model.Product;

/**
 * @author divyansh.singh
 *
 */
public interface ProductDao {

	public void showProducts();
	public Product addProduct(Product p) throws ProductAlreadyExistException;
	public int deleteProduct(int id) throws ProductNotFoundException, ProductDoesNotExistException;
	public Product getProductById(int id) throws ProductDoesNotExistException;
	public Product updateProduct(int id, Product p) throws ProductDoesNotExistException;

}
