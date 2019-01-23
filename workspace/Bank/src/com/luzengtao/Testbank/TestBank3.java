package com.luzengtao.Testbank;

import org.testng.annotations.Test;

import com.luzengtao.bank3.Account;
import com.luzengtao.bank3.Customer;



public class TestBank3 {

	@Test
	public void testBank() {
		Customer customer ;
		Account account ;
		
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane","Smith");
		
		System.out.println("Creating thw caaount with a 500.00 balance.");
		customer.setAccount(new Account(500));
		
		account = customer.getAccount();
		
		System.out.println("Withdraw 150.00");
		account.withdraw(150);
		
		System.out.println("Deposit 22.50");
		account.deposit(22.5);
		
		System.out.println("Withdraw 47.62");
		account.withdraw(800.62);
		
		System.out.println("Customer [" +customer.getLastName()
					+ "," + customer.getFirstName()
					+ "] has a balance of " + account.getBalance());
	}
}
