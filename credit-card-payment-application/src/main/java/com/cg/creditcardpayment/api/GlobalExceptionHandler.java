package com.cg.creditcardpayment.api;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.creditcardpayment.exception.AccountException;
import com.cg.creditcardpayment.exception.CustomerException;
import com.cg.creditcardpayment.exception.PaymentException;
import com.cg.creditcardpayment.exception.StatementException;
import com.cg.creditcardpayment.exception.TransactionException;
import com.cg.creditcardpayment.exception.LoginException;

/**
 * 
 * @author venkata sai reddy
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 
	 * @param exception of Login
	 * @return exception message
	 */
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(LoginException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * 
	 * @param exception of Customers
	 * @return Exception Message
	 */
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(CustomerException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * 
	 * @param exception of Payment
	 * @return Exception Message
	 */
	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(PaymentException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	/**
	 * 
	 * @param exception of Statement
	 * @return Exception Message
	 */
	@ExceptionHandler(StatementException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(StatementException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	/**
	 * 
	 * @param exception of Transactions
	 * @return Exception Message
	 */
	@ExceptionHandler(TransactionException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(TransactionException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	/**
	 * 
	 * @param exception of Accounts
	 * @return Exception Message
	 */
	@ExceptionHandler(AccountException.class)
	public ResponseEntity<String> handleCreditCardPaymentExceptionAction(AccountException excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.BAD_REQUEST);
	}
	/**
	 * 
	 * @param exception
	 * @return Exception Message
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptionAction(Exception excep) {
		return new ResponseEntity<>(excep.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	/**
	 * 
	 * @param result
	 * @return String of All Exception Messages
	 */
	static String messageFrom(BindingResult result) {		
		return result.getAllErrors().stream()
				.map(err -> err.getObjectName() + "-"+err.getDefaultMessage())
				.collect(Collectors.toList()).toString();
	}
}
