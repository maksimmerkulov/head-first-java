package com.headfirstjava.chapter09;

public abstract class Animal {
    private String name;

    public Animal(String theName) {
        name = theName;
    }

    public String getName() {
        return name;
    }
}