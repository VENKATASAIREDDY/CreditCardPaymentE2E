package com.cg.creditcardpayment.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author G Naveen
 *
 */
public class TransactionModel {

	private Long transactionId;

	@NotNull(message="CardNumber Cannot to be Null")
	@NotEmpty(message="CardNumber cannot be Empty")
	private String cardNumber;
	
	@NotNull(message="date Cannot to be Null")
	@NotEmpty(message="date cannot be Empty")
	private LocalDate transactionDate;
	
	@NotNull(message="time Cannot to be Null")
	@NotEmpty(message="time cannot be Empty")
	private LocalTime transactionTime;
	
	@NotNull(message="amount Cannot to be Null")
	@NotEmpty(message="amount cannot be Empty")
	private Double amount;

	@NotNull(message="status Cannot to be Null")
	@NotEmpty(message="status cannot be Empty")
	private TransactionStatus status;
	
	@NotNull(message="description Cannot to be Null")
	@NotEmpty(message="description cannot be Empty")
	private String description;
	
	public TransactionModel() {
		/* Default Constructor*/
	}

	/**
	 * 
	 * @param transactionId
	 * @param cardNumber
	 * @param amount
	 * @param transactionDate
	 * @param transactionTime
	 * @param status
	 * @param description
	 */
	public TransactionModel(Long transactionId, String cardNumber, Double amount, LocalDate transactionDate, LocalTime transactionTime, TransactionStatus status, String description) {
		super();
		this.transactionId = transactionId;
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.amount = amount;
		this.status = status;
		this.description = description;
	}
	
	/**
	 * @return the transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
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
	 * @return the transactionDate
	 */
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the transactionTime
	 */
	public LocalTime getTransactionTime() {
		return transactionTime;
	}

	/**
	 * @param transactionTime the transactionTime to set
	 */
	public void setTransactionTime(LocalTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the status
	 */
	public TransactionStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + ((transactionTime == null) ? 0 : transactionTime.hashCode());
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
		TransactionModel other = (TransactionModel) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (transactionTime == null) {
			if (other.transactionTime != null)
				return false;
		} else if (!transactionTime.equals(other.transactionTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"TransactionModel [transactionId=%s, cardNumber=%s, transactionDate=%s, transactionTime=%s, amount=%s, status=%s, description=%s]",
				transactionId, cardNumber, transactionDate, transactionTime, amount, status, description);
	}
	
	
}
