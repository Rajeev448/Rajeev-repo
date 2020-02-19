package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmiDetails 
{	
	@Id
	private int emiPaymentId;
	private int loanNumber;
	private double emiPayment;
	private String emiLastDate;
	private double emiPaidAmount;
	private double totalAmount;
	
	
	//Setter and Getter
	public int getEmiPaymentId() {
		return emiPaymentId;
	}
	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getEmiPayment() {
		return emiPayment;
	}
	public void setEmiPayment(double emiPayment) {
		this.emiPayment = emiPayment;
	}
	public String getEmiLastDate() {
		return emiLastDate;
	}
	public void setEmiLastDate(String emiLastDate) {
		this.emiLastDate = emiLastDate;
	}
	public double getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
