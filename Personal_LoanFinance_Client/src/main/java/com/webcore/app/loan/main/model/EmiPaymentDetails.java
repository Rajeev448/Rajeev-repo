package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmiPaymentDetails 
{
	@Id
	private int emiPaymentId;
	private int loanNumber;
	private double emiAmount;
	private String emiLastDate;
	private double emiPaidAmount;
	private double totalAmount;
	private String emiPaidDate;
	
	
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
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
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
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	
}
