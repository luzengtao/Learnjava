package com.luzengtao.Testbank;

import org.testng.annotations.Test;

import com.luzengtao.bank.Account;
import com.luzengtao.bank.Customer;



public class TestBank2 {

	@Test
	public void testBank() {
		Customer customer ;
		Account account ;
		
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane","Smith");
		
		System.out.println("Creating thw caaount with a 500.00 balance.");
		account = new Account(500);
		
		customer.setAccount(account);
		
		System.out.println("Withdraw 150.00");
		customer.getAccount().withdraw(150);
		
		System.out.println("Deposit 22.50");
		customer.getAccount().deposit(22.5);
		
		System.out.println("Withdraw 47.62");
		customer.getAccount().withdraw(47.62);
		
		System.out.println("Customer [" +customer.getLastName()
					+ "," + customer.getFirstName()
					+ "] has a balance of " + account.getBalance());
	}
}
