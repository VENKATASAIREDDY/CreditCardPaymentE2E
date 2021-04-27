package com.cg.creditcardpayment.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
/**
 * 
 * @author Shambhavi
 *
 */
public class LoginModel {
	
	/**
	 * This a local variable: {@link #userId} defines the user ID of Customer which should not be Null
	* @HasGetter
	* @HasSetter
	*/
	@NotNull(message="user id cannot be null")	
	@NotBlank(message="user id cannot be blank")
	@Pattern(regexp="^[A-Za-z][A-Za-z0-9]{3,20}$",message="user id should be min length 4")
	private String userId;
	
	/**
	 * This a local variable: {@link #password} defines the Password of Customer which should not be Null
	* @HasGetter
	* @HasSetter
	*/
	@NotNull(message="password cannot be null")	
	@NotBlank(message="password cannot be blank")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&()])(?=\\S+$).{8,30}$",message="Password should contain atleast one Capital, Lower, Numeric and special charecters with min length of 8")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	private String role;
	
	public LoginModel() {
		/* Default Constructor*/
	}

	/**
	 * 
	 * @param userId
	 * @param password
	 * @param role
	 */
	public LoginModel(
			@NotNull(message = "user id cannot be null") @NotBlank(message = "user id cannot be blank") @Pattern(regexp="^[A-Za-z][A-Za-z0-9]{3,20}$") String userId,
			@NotNull(message = "password cannot be null") @NotBlank(message = "password cannot be blank") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&()])(?=\\S+$).{8,30}$") String password,
			String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("User [userId=%s, password=%s, role=%s]", userId, password, role);
	}
	
	
}
