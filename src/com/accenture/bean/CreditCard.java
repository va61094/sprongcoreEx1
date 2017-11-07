package com.accenture.bean;

public class CreditCard {

	private long cno;
	private String expiry;
	private int cvv;
	public void setCno(long cno) {
		this.cno = cno;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [cno=" + cno + ", expiry=" + expiry + ", cvv=" + cvv + "]";
	}
	
	
}
