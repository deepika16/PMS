/**
 * 
 */
package com.yash.pms.exceptions;

/**
 * @author divyansh.singh
 *
 */
public class ProductDoesNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductDoesNotExistException(String msg) {
		super(msg);
	}
	
}
