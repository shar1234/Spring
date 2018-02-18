package com.sharafath.entity;

public class Address {

	String streetname;
	String pincode;
	
	public Address(){
		
	}
	
	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", pincode=" + pincode + "]";
	}

	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
