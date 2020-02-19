package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LedgerDetails 
{
	@Id
	private int ledgerDetailsId;
	private int customerId;
	private String caseNumber;
	private int loanDisbursmentId;
	private double totalAmount;
	private int tenure;
	private double emiId;
	private double advanceEmi;
	private double ledgerDetailsEmiPaidAmount;
	private String emiStartDate;
	private String ledgerCreatedDate;
	
	
	//Setter and getter
	
	
	public int getLedgerDetailsId() {
		return ledgerDetailsId;
	}
	public void setLedgerDetailsId(int ledgerDetailsId) {
		this.ledgerDetailsId = ledgerDetailsId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public int getLoanDisbursmentId() {
		return loanDisbursmentId;
	}
	public void setLoanDisbursmentId(int loanDisbursmentId) {
		this.loanDisbursmentId = loanDisbursmentId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmiId() {
		return emiId;
	}
	public void setEmiId(double emiId) {
		this.emiId = emiId;
	}
	public double getAdvanceEmi() {
		return advanceEmi;
	}
	public void setAdvanceEmi(double advanceEmi) {
		this.advanceEmi = advanceEmi;
	}
	public double getLedgerDetailsEmiPaidAmount() {
		return ledgerDetailsEmiPaidAmount;
	}
	public void setLedgerDetailsEmiPaidAmount(double ledgerDetailsEmiPaidAmount) {
		this.ledgerDetailsEmiPaidAmount = ledgerDetailsEmiPaidAmount;
	}
	public String getEmiStartDate() {
		return emiStartDate;
	}
	public void setEmiStartDate(String emiStartDate) {
		this.emiStartDate = emiStartDate;
	}
	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}
	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}
	

	
}
