package com.luzengtao.lesson5Test;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

/*
* 定义PayrollSystem类，创建Employee变量数组，该数组存放各类雇员对象的引用。
* 利用循环结构没，输入本月月份值，输出各个对象的类型，name，number，birthday以及该对象的生日；
* 如果本月是某个Employee对象的生日，还要输出增加工资信息
*
* */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];

        employees[0] = new SalariedEmployee("TOM",1001,
                new MyDate(12,12,1990),3000);
        employees[1] = new SalariedEmployee("Jerry",1002,
                new MyDate(4,11,1990),5000);
        employees[2] = new HourlyEmployee("Mike",1003,
                new MyDate(5,11,1990),200,8);

//        Date currentData = new Date();
//        System.out.println(currentData.getMonth()+1);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));


        for (Employee employee:employees){
            System.out.println(employee);
            System.out.println("工资："+employee.earnings());
            if (employee.getBirthday().getMonth() == calendar.get(Calendar.MONTH)+1){
                System.out.println("生日补贴：100");
            }


        }


    }
}
