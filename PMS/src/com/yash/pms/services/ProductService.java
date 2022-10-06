/**
 * 
 */
package com.yash.pms.services;

import com.yash.pms.daoImpl.ProductDaoImpl;
import com.yash.pms.exceptions.InvalidInput;
import com.yash.pms.exceptions.ProductAlreadyExistException;
import com.yash.pms.exceptions.ProductDoesNotExistException;
import com.yash.pms.model.Product;

/**
 * @author divyansh.singh
 *
 */
public class ProductService {


	ProductDaoImpl dao = new ProductDaoImpl();

	public void initProducts() {

		dao.initProducts();
	}

	public void showProducts() {

		dao.showProducts();
	}


	//Show products menu
	public void menu() {
		System.out.println("Select 1 for Show all products");
		System.out.println("Select 2 for Add product");
		System.out.println("Select 3 for Delete product");
		System.out.println("Select 4 for Find product details by ID");
		System.out.println("Select 5 for Update product");
		System.out.println("Select 6 for exit");

	}


	/*
	 * Dynamically increase the array size of product array by one and return the object
	 */
	public Product addProduct(Product product) throws ProductAlreadyExistException, InvalidInput {
		if(product.getPid() < 0 || product.getPprice() < 0) {
			throw new InvalidInput("ID cannot be negative");
		}
		Product newProduct = dao.addProduct(product);
		return newProduct;
	}

	/*
	 * Delete the product for the given provided input ID
	 */
	public int deleteProduct(int id) throws InvalidInput, ProductDoesNotExistException {
		if(id < 0 ) {
			throw new InvalidInput("ID cannot be negative");
		}
		int deleteId = dao.deleteProduct(id);
		return deleteId;
	}
	
	/*
	 * Retrieve all product details by product ID
	 */
	public Product getProductById(int id) throws ProductDoesNotExistException, InvalidInput {
		
		if(id < 0)
			throw new InvalidInput("ID cannot be negative");
		
		Product retrieveProduct = dao.getProductById(id);
		return retrieveProduct;
	}
	
	/*
	 * Update the product details
	 */
	public Product updateProductById(int id, Product p) throws InvalidInput, ProductDoesNotExistException {
		if(p.getPid() < 0 || p.getPprice() < 0) {
			throw new InvalidInput("ID cannot be negative");
		}
		Product updatedProduct = dao.updateProduct(id, p);
		return updatedProduct;
	}




}
