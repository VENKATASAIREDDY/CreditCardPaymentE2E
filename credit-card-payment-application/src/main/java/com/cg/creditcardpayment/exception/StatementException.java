package com.cg.creditcardpayment.exception;

/**
 * 
 * @author P Venkata Sai Reddy
 *
 */
public class StatementException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public StatementException(String exp) {
		super(exp);
	}

}
