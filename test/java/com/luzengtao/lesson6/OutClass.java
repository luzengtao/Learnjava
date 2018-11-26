package com.luzengtao.lesson6;

public class OutClass {

    private String OutName ="ABC";

    static class StaticInnerClass{
        private String StaticInnerName = "HIJ";
        public void test(){
//            静态内部类中的方法不能访问外部类的非静态成员。
//            System.out.println("OutName: "+ OutName);
            System.out.println("StaticInnerName: "+ StaticInnerName);
        }
    }
    private int i = 1;
//    在类的内部定义的类：内部类。
    class InnerClass{
        private String innerName ="DEF";

        private int i = 2;

        public void test(){

            int i = 3;
            System.out.println(i);
            System.out.println(this.i);
//          通过以下方式访问外部类的成员变量；
            System.out.println(OutClass.this.i);

            System.out.println("OutName: "+ OutName);
            System.out.println("innerName "+ innerName);
    }
    }
}
