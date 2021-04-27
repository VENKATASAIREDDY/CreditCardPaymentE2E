package com.cg.creditcardpayment.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
/**
 * 
 * @author Shambhavi
 *
 */
public class SignUp {
	
	/**
	 * @HasGetter
	 * @HasSetter
	 */
	@NotNull(message="user id cannot be null")	
	@NotBlank(message="user id cannot be blank")
	@Pattern(regexp="^[A-Za-z][A-Za-z0-9]{3,20}$")
	private String userId;
	
	/**
	 * @HasGetter
	 * @HasSetter
	 */
	@NotNull(message="Key cannot be null")	
	@NotBlank(message="Key cannot be blank")
//	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{4,10}$")
	private String key;
	
	/**
	 * @HasGetter
	 * @HasSetter
	 */
	@NotNull(message="Create password cannot be null")	
	@NotBlank(message="Create password cannot be blank")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&()])(?=\\S+$).{8,30}$")
	private String createPassword;
	
	/**
	 * @HasGetter
	 * @HasSetter
	 */
	@NotNull(message="confirm password cannot be null")	
	@NotBlank(message="confirm password cannot be blank")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&()])(?=\\S+$).{8,30}$")
	private String confirmPassword;
	
	
	public SignUp() {
		
	}
	
	/**
	 * 
	 * @param userId
	 * @param key
	 * @param createPassword
	 * @param confirmPassword
	 */
	public SignUp(String userId, String key, String createPassword, String confirmPassword) {
		super();
		this.userId = userId;
		this.key = key;
		this.createPassword = createPassword;
		this.confirmPassword = confirmPassword;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the createPassword
	 */
	public String getCreatePassword() {
		return createPassword;
	}

	/**
	 * @param createPassword the createPassword to set
	 */
	public void setCreatePassword(String createPassword) {
		this.createPassword = createPassword;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return String.format("SignUp [userId=%s, key=%s, createPassword=%s, confirmPassword=%s]", userId, key,
				createPassword, confirmPassword);
	}
	
	

}
