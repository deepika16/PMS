package com.yash.pms.exceptions;

public class ProductAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductAlreadyExistException(String msg) {
		super("Problem occured: "+msg);
	}
	
}
