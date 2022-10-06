/**
 * 
 */
package com.yash.pms.daoImpl;

import java.util.Arrays;

import com.yash.pms.dao.ProductDao;
import com.yash.pms.exceptions.ProductAlreadyExistException;
import com.yash.pms.exceptions.ProductDoesNotExistException;
import com.yash.pms.model.Product;

/**
 * @author divyansh.singh
 *
 */
public class ProductDaoImpl implements ProductDao {

	//Declaring product array
	Product[] arr = new Product[3];

	//Initializing default products 
	public void initProducts() {

		arr[0] = new Product(101, "realme 10", 30000);
		arr[1] = new Product(102, "realme 11", 50000);
		arr[2] = new Product(103, "realme 12", 90000);
	}

	// Show all products in array
	public void showProducts() {
		System.out.println("List of products:");
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);	
		System.out.println();

	}


	//Created and insert new product in the object array
	@Override
	public Product addProduct(Product product) throws ProductAlreadyExistException {

		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(product.getPid() ==arr[i].getPid())
				throw new ProductAlreadyExistException("Product already exists, can't perform re-add.");
		}
		arr = Arrays.copyOf(arr, n+1);
		arr[n] = product;
		return arr[n];

	}

	@Override
	public int deleteProduct(int id) throws ProductDoesNotExistException {

		int n = arr.length;
		int deleteId=-1;

		for(int i=0; i < n; i++) {

			if(arr[i].getPid() == id) {
				deleteId = arr[i].getPid();
				arr[i] = null;
				break;
			}
		}
		if(deleteId == -1) {
			throw new ProductDoesNotExistException("Product not found, can't delete any data.");
		}
		return deleteId;
	}

	@Override
	public Product getProductById(int id) throws ProductDoesNotExistException {

		int n = arr.length;
		Product getProduct = null;
		boolean temp = false;

		for(int i=0; i<n; i++) {
			if(arr[i].getPid() == id) {
				getProduct = arr[i];
				temp = true;
			}

		}
		if(temp == false)
			throw new ProductDoesNotExistException("Product not found, can't retrieve any data.");

		return getProduct;
	}


	@Override
	public Product updateProduct(int id, Product p) throws ProductDoesNotExistException {

		int n = arr.length;
		Product updatedProduct = null;
		boolean temp = false;

		for(int i=0; i<n; i++) {
			if(arr[i].getPid() == id) {
				//update product when found
				arr[i].setPid(p.getPid());
				arr[i].setPname(p.getPname());
				arr[i].setPprice(p.getPprice());
				updatedProduct = arr[i];
				temp = true;
			}
		}
		if(temp == false)
			throw new ProductDoesNotExistException("Product not found, can't update any data.");
		
		return updatedProduct;
	}


}
