package com.luzengtao.learn.ex3;

public class Customer {
	
	private String customerName;
	
	private int age;
	
	private String gender;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Customer(String customerName, int age, String gender) {
		super();
		this.customerName = customerName;
		this.age = age;
		this.gender = gender;
	}
	
	
}
