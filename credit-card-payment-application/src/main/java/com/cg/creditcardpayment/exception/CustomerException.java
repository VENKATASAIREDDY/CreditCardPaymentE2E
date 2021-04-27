package com.cg.creditcardpayment.exception;

/**
 * 
 * @author P Venkata Sai Reddy
 *
 */
public class CustomerException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public CustomerException(String exp) {
		super(exp);
	}

}
