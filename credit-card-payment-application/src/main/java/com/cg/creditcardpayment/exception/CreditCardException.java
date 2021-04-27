package com.cg.creditcardpayment.exception;
/**
 * 
 * @author Abhilash
 *
 */
public class CreditCardException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public CreditCardException(String exp) {
		super(exp);
	}

}
