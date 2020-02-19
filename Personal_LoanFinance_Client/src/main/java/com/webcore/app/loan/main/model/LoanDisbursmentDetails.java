package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanDisbursmentDetails 
{
	@Id
	private int loanDisbursmentId;
	private int loanNumber;
	private double loanAAmount;
	private int tenure;
	private double emi;
	private int statusCode;
	
	
	//Setter and Getter
	public int getLoanDisbursmentId() {
		return loanDisbursmentId;
	}
	public void setLoanDisbursmentId(int loanDisbursmentId) {
		this.loanDisbursmentId = loanDisbursmentId;
	}
	
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAAmount() {
		return loanAAmount;
	}
	public void setLoanAAmount(double loanAAmount) {
		this.loanAAmount = loanAAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
