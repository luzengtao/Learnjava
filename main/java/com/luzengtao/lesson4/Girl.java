package com.luzengtao.lesson4;

public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void answer(Boy boy){
        System.out.println("我愿意："+boy.getName());
    }

}
