package com.bikkadIT.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TikitAdmin {
	
	private long pnrNo;
	
	private String tikitStatus;
	
	private double tikitPrice;

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getTikitStatus() {
		return tikitStatus;
	}

	public void setTikitStatus(String tikitStatus) {
		this.tikitStatus = tikitStatus;
	}

	public double getTikitPrice() {
		return tikitPrice;
	}

	public void setTikitPrice(double tikitPrice) {
		this.tikitPrice = tikitPrice;
	}

	public TikitAdmin(long pnrNo, String tikitStatus, double tikitPrice) {
		super();
		this.pnrNo = pnrNo;
		this.tikitStatus = tikitStatus;
		this.tikitPrice = tikitPrice;
	}

	public TikitAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TikitAdmin [pnrNo=" + pnrNo + ", tikitStatus=" + tikitStatus + ", tikitPrice=" + tikitPrice + "]";
	}
	
	
	

}
