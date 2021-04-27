package com.cg.creditcardpayment.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <h1>Statements Model</h1>
 * 
 * @author P Venkata Sai Reddy
 * @version 1.0
 * @since   2021-03-31 
 */
public class StatementModel {	
	
	/**
	 * This a local variable: {@link #statementId} defines the unique Id for Statements
	 * @HasGetter
	 */
	private Long statementId;
	
	/**
	 * This a local variable: {@link #dueAmount} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="due amount cannot be null")	
	@NotBlank(message="due amount cannot be blank")
	private Double dueAmount;
	
	/**
	 * This a local variable: {@link #billAmount} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="bill amount cannot be null")	
	@NotBlank(message="bill amount cannot be blank")
	private Double billAmount;
	
	/**
	 * This a local variable: {@link #billDate} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="bill date cannot be null")	
	@NotBlank(message="bill date cannot be blank")
	private LocalDate billDate;
	
	/**
	 * This a local variable: {@link #billTime} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="bill date cannot be null")	
	@NotBlank(message="bill date cannot be blank")
	private LocalTime billTime;
	
	/**
	 * This a local variable: {@link #dueDate} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="due date cannot be null")	
	@NotBlank(message="due date cannot be blank")
	private LocalDate dueDate;

	/**
	 * This a local variable: {@link #cardNumber} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="credit card cannot be null")	
	@NotBlank(message="credit card cannot be blank")
	private String cardNumber;

	/**
	 * This a local variable: {@link #customerName} 
	 * @HasGetter
	 * @HasSetter
	 */	
	@NotNull(message="customer name cannot be null")	
	@NotBlank(message="customer name cannot be blank")
	private String customerName;
	
	public StatementModel() {
		/*Default Constructor*/
	}

	

	/**
	 * @param statementId
	 * @param dueAmount
	 * @param billDate
	 * @param dueDate
	 * @param cardNumber
	 */
	public StatementModel(Long statementId,
			@NotNull(message = "bill amount cannot be null") @NotBlank(message = "bill amount cannot be blank") Double billAmount,
			Double dueAmount,
			@NotNull(message = "bill date cannot be null") @NotBlank(message = "bill date cannot be blank") LocalDate billDate,
			LocalTime billTime,
			@NotNull(message = "due date cannot be null") @NotBlank(message = "due date cannot be blank") LocalDate dueDate,
			@NotNull(message = "credit card cannot be null") @NotBlank(message = "credit card cannot be blank") String cardNumber,
			@NotNull(message="customer name cannot be null") @NotBlank(message="customer name cannot be blank") String customerName) {
		super();
		this.statementId=statementId;
		this.dueAmount = dueAmount;
		this.billDate = billDate;
		this.billTime = billTime;
		this.billAmount=billAmount;
		this.dueDate = dueDate;
		this.cardNumber = cardNumber;
		this.customerName=customerName;
	}

	
	/**
	 * @return the statementId
	 */
	public Long getStatementId() {
		return statementId;
	}

	/**
	 * @param statementId the statementId to set
	 */
	public void setStatementId(Long statementId) {
		this.statementId = statementId;
	}

	/**
	 * @return the dueAmount
	 */
	public Double getDueAmount() {
		return dueAmount;
	}

	/**
	 * @param dueAmount the dueAmount to set
	 */
	public void setDueAmount(Double dueAmount) {
		this.dueAmount = dueAmount;
	}

	/**
	 * @return the billAmount
	 */
	public Double getBillAmount() {
		return billAmount;
	}

	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	/**
	 * @return the billDate
	 */
	public LocalDate getBillDate() {
		return billDate;
	}

	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the billTime
	 */
	public LocalTime getBillTime() {
		return billTime;
	}

	/**
	 * @param billTime the billTime to set
	 */
	public void setBillTime(LocalTime billTime) {
		this.billTime = billTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billAmount == null) ? 0 : billAmount.hashCode());
		result = prime * result + ((billDate == null) ? 0 : billDate.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
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
		StatementModel other = (StatementModel) obj;
		if (billAmount == null) {
			if (other.billAmount != null)
				return false;
		} else if (!billAmount.equals(other.billAmount))
			return false;
		if (billDate == null) {
			if (other.billDate != null)
				return false;
		} else if (!billDate.equals(other.billDate))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return String.format(
				"StatementModel [statementId=%s, dueAmount=%s, billAmount=%s, billDate=%s, dueDate=%s, cardNumber=%s, customerName=%s]",
				statementId, dueAmount, billAmount, billDate, dueDate, cardNumber, customerName);
	}	
	
	



		
	
}
