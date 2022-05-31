package com.ibm.bean;

public class CustomerBean
{
	private int customerId;
	private String customerName;
	private String customerDob;
	private String customerAddress;
	private int customerPincode;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}
	
}