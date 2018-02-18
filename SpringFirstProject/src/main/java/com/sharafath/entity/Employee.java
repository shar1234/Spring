package com.sharafath.entity;

public class Employee {
 
	//Attributes
	int eid;
	String name;
	Address address;
	
	
	public Employee(){
		System.out.println("Object got constructed");
	}
	
	public void init(){
		System.out.println("intialize method");
	}
	
	public void destroy(){
		System.out.println("Object got destroyed");
	}
	
	
	public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
