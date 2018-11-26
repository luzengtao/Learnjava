package com.luzengtao.lessons3Test;

import com.luzengtao.lesson4.Boy;
import com.luzengtao.lesson4.Girl;
import org.testng.annotations.Test;

import java.time.LocalDate;


public class TestMarry {

        @Test
        public static void  Testmarry(){
            Boy boy = new Boy("Tom");
            Girl girl = new Girl("jerry");
            boy.marry(girl);

        }

}
