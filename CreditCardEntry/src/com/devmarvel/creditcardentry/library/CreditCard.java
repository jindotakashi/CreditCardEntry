package com.devmarvel.creditcardentry.library;

public class CreditCard {
	
	private String cardNumber;
	private String expDate;
	private String securityCode;
	private String zipCode;

	public CreditCard(String cardNumber, String expDate, String securityCode, String zipCode)
	{
		this.setCardNumber(cardNumber);
		this.setExpDate(expDate);
		this.setSecurityCode(securityCode);
		this.setZipCode(zipCode);
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
