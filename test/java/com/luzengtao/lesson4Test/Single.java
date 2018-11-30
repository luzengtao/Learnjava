package com.luzengtao.lesson4Test;

//    采取一定的方法，保证在整个软件系统中，对某个类只能存在一个实例对象；
public class Single {

//1.在类的外部不能通过new/构造器的方式创建实例,把构造器隐藏起来（构造器私有化）
    private Single(){ }
//2.因为在类的外部不能创建类的实例，只能在类的内部创建；
//3.为了让类的外部可以使用该实例，使用static 修饰；
//4.不能在类的外部可以修改该属性：私有化该属性，同时提供共有的get方法来访问
    private static Single instance = new Single();

    public static Single getInstance() {
        return instance;
    }

    public static void main(String[] args) {
//       int x = 34.5;
//       boolean boo = x;
        int g = 17;
        int y = g;
        y = y+10;
        short s;
//        s = y;
        byte b = 3;
        byte v = b;
        short n =12;
//        v = n;
//        byte k = 128;
        int p = 3*g+y;
    Single single = new Single();

     Single [] pets = new Single[7];

     pets [0] = new Single();
     pets [1] = new Single();
     pets [2] = new Single();
     pets [3] = pets[2];



    }



}
