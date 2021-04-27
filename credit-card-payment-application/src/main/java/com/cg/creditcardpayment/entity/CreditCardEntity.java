package com.cg.creditcardpayment.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cg.creditcardpayment.model.CardName;
import com.cg.creditcardpayment.model.CardType;

/**
* <h1>CreditCardEntity</h1>
* The CreditCardEntity program implements an application such that
* the data of the creditcards is sent to the database
* <p>
* 
*
* @author  Abhilash Reddy Gone
* @version 1.0
* @since   2021-03-31 
*/
@Entity
@Table(name="creditcards")
public class CreditCardEntity {
	/**
	 * This a local variable: {@link #cardNumber} defines the unique Number for Credit Card
	 * @HasGetter
	 * @HasSetter
	 */
	@Id
	@Column(name="card_number")
	private String cardNumber;
	/**
	 * This a local variable: {@link #cardName} defines the name of the Credit Card
	 * @HasGetter
	 * @HasSetter 
	 */
	@Column(name="card_name", nullable=false)
	@Enumerated(EnumType.STRING)
	private CardName cardName;
	/**
	 * This a local variable: {@link #cardType} defines the type of the Credit Card
	 * @HasGetter
	 * @HasSetter 
	 */
	@Column(name="card_type",nullable=false)
	@Enumerated(EnumType.STRING)
	private CardType cardType;
	/**
	 * This a local variable: {@link #expiryDate} defines the expire date of the credit card 
	 * @HasGetter
	 * @HasSetter
	 */
	@Column(name="expiry_date", nullable=false)
    private LocalDate expiryDate;
	/**
	 *This a local variable: {@link #bankName} defines the bank name of the credit card 
	 * @HasGetter
	 * @HasSetter
	 */
	@Column(name="bank_name", nullable=false)
	private String bankName;
	/**
	 * This a local variable: {@link #cvv} defines the cvv present on the credit card and it should not be null
	 * @HasGetter
	 * @HasSetter
	 */
	@Column(name="cvv", nullable=false)
    private Integer cvv;
	/**
	 * This a local variable: {@link #creditLimit} defines the maximum limit that can be used by the user
	 * @HasGetter
	 * @HasSetter
	 */
	@Column(name="credit_limit",nullable=false)
	private Double creditLimit;
	/**
	 * This a local variable: {@link #usedLimit} defines the limit used by the customer from the credit card 
	 * @HasGetter
	 * @HasSetter
	 */
	@Column(name="used_limit")
	private Double usedLimit;
	
	
	/**
	 * This a local variable: {@link #customer} defines the customer to which the credit card belongs to.
	 * @HasGetter
	 * @HasSetter
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private CustomerEntity customer;
	/**
	 * This a local variable: {@link #transaction} defines the transactions of the credit cards.
	 * @HasGetter
	 * @HasSetter
	 */
	@OneToMany(mappedBy="creditCard",cascade=CascadeType.ALL)
	private Set<TransactionEntity> transaction;
	
	/**
	 * This a local variable: {@link #statement} defines the statements of the credit cards.
	 * @HasGetter
	 * @HasSetter
	 */
	@OneToMany(mappedBy="creditCard",cascade=CascadeType.ALL)
	private Set<StatementEntity> statement;
	/**
	 * This a local variable: {@link #payments} defines the payments of the credit cards.
	 * @HasGetter
	 * @HasSetter
	 */
	@OneToMany(mappedBy="card",cascade=CascadeType.ALL)
	private List<PaymentEntity> payments;
	/**
	 * Default Constructor
	 */
	public CreditCardEntity() {
		/* Default Constructor */
	}
	/**
	 * @return creditLimit in Double
	 */
	public Double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param cardNumber 
	 * @param cardName
	 * @param cardType
	 * @param expiryDate
	 * @param bankName
	 * @param cvv
	 * @param creditLimit
	 * @param usedLimit
	 * @param customer
	 */
	public CreditCardEntity(String cardNumber, CardName cardName, CardType cardType, LocalDate expiryDate,
			String bankName, Integer cvv, Double creditLimit, Double usedLimit, CustomerEntity customer) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
		this.bankName = bankName;
		this.cvv = cvv;
		this.creditLimit = creditLimit;
		this.usedLimit = usedLimit;
		this.customer = customer;
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
	 * @return the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}
	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(CardName cardName) {
		this.cardName = cardName;
	}
	/**
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the expiryDate
	 */
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the cvv
	 */
	public Integer getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the usedLimit
	 */
	public Double getUsedLimit() {
		return usedLimit;
	}
	/**
	 * @param usedLimit the usedLimit to set
	 */
	public void setUsedLimit(Double usedLimit) {
		this.usedLimit = usedLimit;
	}
	/**
	 * @return the customer
	 */
	public CustomerEntity getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	/**
	 * @return the transaction
	 */
	public Set<TransactionEntity> getTransaction() {
		return transaction;
	}
	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(Set<TransactionEntity> transaction) {
		this.transaction = transaction;
	}
	/**
	 * @return the statement
	 */
	public Set<StatementEntity> getStatement() {
		return statement;
	}
	/**
	 * @param statement the statement to set
	 */
	public void setStatement(Set<StatementEntity> statement) {
		this.statement = statement;
	}
	/**
	 * @return the payments
	 */
	public List<PaymentEntity> getPayments() {
		return payments;
	}
	/**
	 * @param payments the payments to set
	 */
	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}
	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((cvv == null) ? 0 : cvv.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		return result;
	}
	/**
	 * Indicates whether some other object is "equal to" this one.<br><br>
	 * The <strong>equals</strong> method for class <strong>Object</strong> implements the most discriminating possible equivalence relation on objects; 
	 * that is, for any non-null reference values x and y, this method returns <strong>true</strong> if and only if x and y refer to the same object (<strong>x == y</strong> has the value <strong>true</strong>).
	 * <br><br>Note that it is generally necessary to override the <strong>hashCode</strong> method whenever this method is overridden, 
	 * so as to maintain the general contract for the <strong>hashCode</strong> method,
	 * which states that equal objects must have equal hash codes.
	 * <br>
	 * @param obj the reference object with which to compare.
	 * 
	 * @return true if this object is the same as the obj argument; false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCardEntity other = (CreditCardEntity) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		
		return true;
	}
	/**
	 * Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object. 
	 * The result should be a concise but informative representation that is easy for a person to read.
	 * 
	 * @return a string representation of the object.
	 */
	@Override
	public String toString() {
		return String.format(
				"cardNumber=%s, cardName=%s, cardType=%s, expiryDate=%s, bankName=%s, cvv=%s, customer=%s",
				cardNumber, cardName, cardType, expiryDate, bankName, cvv, customer.getName());
	}

	
    
}
