package com.luzengtao.lesson6.TestInterface;

public class TestCompareCircle {

    public static void main(String[] args) {
        CompareCircle cc1 = new CompareCircle() {
            @Override
            public int compareTo(Object o1, Object o2) {
                return 0;
            }
        };
        cc1.setRadius(4);

        CompareCircle cc2 = new CompareCircle() {
            @Override
            public int compareTo(Object o1, Object o2) {
                return 0;
            }
        };
        cc2.setRadius(7);

        System.out.println(cc1.compareTo(cc2));
    }
}
