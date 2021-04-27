package com.cg.creditcardpayment.exception;

/**
 * 
 * @author Shambhavi
 *
 */
public class LoginException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param exp
	 */
	public LoginException(String exp) {
		super(exp);
	}

}
