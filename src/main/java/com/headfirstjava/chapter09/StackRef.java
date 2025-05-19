package com.headfirstjava.chapter09;

public class StackRef {
    public void foof() {
        barf();
    }

    public void barf() {
        Duck d = new Duck();
    }
}