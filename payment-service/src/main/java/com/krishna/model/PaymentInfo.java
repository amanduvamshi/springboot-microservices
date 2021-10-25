package com.krishna.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_info")
public class PaymentInfo {
	
	private String cardNumber;
	private String cvv;
	private String mobileNumber;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "PaymentInfo [cardNumber=" + cardNumber + ", cvv=" + cvv + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
}