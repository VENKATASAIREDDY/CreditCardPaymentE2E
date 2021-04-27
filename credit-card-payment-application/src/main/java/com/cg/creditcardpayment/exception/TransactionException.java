package com.cg.creditcardpayment.exception;

/**
 * 
 * @author G Naveen
 *
 */
public class TransactionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public TransactionException(String exp) {
		super(exp);
	}

}
