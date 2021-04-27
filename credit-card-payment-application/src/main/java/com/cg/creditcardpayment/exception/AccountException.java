package com.cg.creditcardpayment.exception;
/**
 * 
 * @author Himavanth
 *
 */
public class AccountException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param exp
	 */
	public AccountException(String exp) {
		super(exp);
	}

}
