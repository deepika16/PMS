/**
 * 
 */
package com.yash.pms.model;

/**
 * @author divyansh.singh
 *
 */
public class Product {
	
	private int pid;
	private String pname;
	private int price;
	/**
	 * @param p_id
	 * @param p_name
	 * @param p_price
	 */
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	/**
	 * @return the p_id
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param p_id the p_id to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the price
	 */
	public int getPprice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPprice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	
	
	
}
