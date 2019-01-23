package com.luzengtao.bank3;

public class Account {
	private double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		if(balance < amt) {
			return false;
		}
		balance -= amt;
		return true;
		
		
	}
}
