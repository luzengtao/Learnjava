package com.luzengtao.Testbank;

import org.testng.annotations.Test;

import com.luzengtao.bank.Account;

public class TestBank {

	@Test
	public void testBank() {
		Account account = new Account(500);
		
		System.out.println("Withdraw 150.00");
		account.withdraw(150);
	
		System.out.println("Depisut 22.50");
		account.deposit(22.5);
		
		System.out.println("Withdraw 47.62");
		account.withdraw(47.62);
		
		System.out.println("The account has a balance of " + account.getBalance());
	}
}
