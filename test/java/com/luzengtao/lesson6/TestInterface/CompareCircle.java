package com.luzengtao.lesson6.TestInterface;

/*
* 定义一个CompareCircle类，继承Circle类；
* 并且实现CompareObject 接口。在CompareCircle 类中给出接口中方法compareTO 的事项。
* 用来比较两个圆的大小；
*
* */
public abstract class CompareCircle extends Circle implements CompareObject{
    @Override
    public int compareTo(Object o) {

        if (o instanceof Circle){
            Circle c = (Circle) o;
            return (int) (this.radius-c.getRadius());
        }
        return 0;
    }
}
