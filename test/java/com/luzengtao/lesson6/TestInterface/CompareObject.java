package com.luzengtao.lesson6.TestInterface;

public interface CompareObject {
//若返回值是0，代表相等；若为正数，代表当前对象大；若为负数代表当前对象小

    public int compareTo(Object o1,Object o2);
}
