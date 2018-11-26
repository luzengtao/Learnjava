package com.luzengtao.lesson4Test;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1000,"12345");
        System.out.println(account);

        Account account2 = new Account(2000,"password");
        System.out.println(account2);
    }


}
