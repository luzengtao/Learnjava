package com.luzengtao.lessons3Test;

public class TestMethodOverloadTest {
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int a,int b){
        System.out.println(a*b);
    }
    public void mOl(String msg){
        System.out.println("CallMOL"+msg);
    }

//    public static void main(String[] args) {
//        TestMethodOverloadTest overload = new TestMethodOverloadTest();
//        overload.mOL(6);
//        overload.mOL(3,5);
//        overload.mOl("智能手机");
//    }

    public int max(int i,int j){
        return i>j ? i : j;
    }
    public double max(double a,double b){
        return a>b ? a : b;
    }
    public double max(double x, double y,double z){
        return (x>y?x:y)>z?(x>y?x:y):z;
    }

    public static void main(String[] args) {
        TestMethodOverloadTest overloadTest = new TestMethodOverloadTest();
        System.out.println(overloadTest.max(4.2,5.6));
        System.out.println(overloadTest.max(3,5));
        System.out.println(overloadTest.max(3.3,2.3,1.99));
    }
}
