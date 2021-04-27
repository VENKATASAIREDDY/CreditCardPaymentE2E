package com.cg.creditcardpayment.exception;

/**
 * 
 * @author Pranava Charitra
 *
 */
public class PaymentException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public PaymentException(String exp) {
		super(exp);
	}

}
