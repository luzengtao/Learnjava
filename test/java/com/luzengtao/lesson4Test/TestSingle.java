package com.luzengtao.lesson4Test;

public class TestSingle {
    public static void main(String[] args) {
//        Single single = new Single();
        Single instance1 = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance1 == instance2);
    }
}
