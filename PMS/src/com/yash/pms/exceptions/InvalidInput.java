/**
 * 
 */
package com.yash.pms.exceptions;

/**
 * @author divyansh.singh
 *
 */
public class InvalidInput extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInput(String msg) {
		super("Problem occurred: " +msg);
	}
}
