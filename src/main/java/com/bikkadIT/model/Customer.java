package com.bikkadIT.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	private String fName;
	
	private String lname;
	
	private String startFrom;
	
	private String destination;
	
	private String doj;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public Customer(String fName, String lname, String startFrom, String destination, String doj) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.startFrom = startFrom;
		this.destination = destination;
		this.doj = doj;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lname=" + lname + ", startFrom=" + startFrom + ", destination="
				+ destination + ", doj=" + doj + "]";
	}
	
	
	
	
	

}
