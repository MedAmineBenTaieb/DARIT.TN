package tn.dari.spring.domain.util;

import java.util.Date;

public class InterestDocuments {

	private int interestId;
	private Date date;
	private boolean accepted;
	private String email;
	private String payslip;
	private String idCard;
	private String engagementLetter;
	private String depositProof;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPayslip() {
		return payslip;
	}
	public void setPayslip(String payslip) {
		this.payslip = payslip;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getEngagementLetter() {
		return engagementLetter;
	}
	public void setEngagementLetter(String engagementLetter) {
		this.engagementLetter = engagementLetter;
	}
	public String getDepositProof() {
		return depositProof;
	}
	public void setDepositProof(String depositProof) {
		this.depositProof = depositProof;
	}
	public InterestDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterestDocuments(int interestId, Date date, boolean accepted, String email, String payslip, String idCard,
			String engagementLetter, String depositProof) {
		super();
		this.interestId=interestId;
		this.date = date;
		this.accepted = accepted;
		this.email = email;
		this.payslip = payslip;
		this.idCard = idCard;
		this.engagementLetter = engagementLetter;
		this.depositProof = depositProof;
	}
	public int getInterestId() {
		return interestId;
	}
	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}
	
	
}
