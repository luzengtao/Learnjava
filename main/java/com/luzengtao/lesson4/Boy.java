package com.luzengtao.lesson4;

public class Boy {
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl){
        System.out.println("嫁给我吧："+girl.getName());
        girl.answer(this);
    }
}
