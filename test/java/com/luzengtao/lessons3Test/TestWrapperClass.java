package com.luzengtao.lessons3Test;

public class TestWrapperClass {
    public static void main(String[] args) {
        int i = 10;

        Integer i2 = new Integer(i);

        int j = Integer.parseInt("1234");
        System.out.println(j);

        boolean falg = new Boolean("true");
        System.out.println(falg);
    }
}
