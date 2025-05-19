package com.headfirstjava.chapter09;

public class ReRef {
    Duck d = new Duck();

    public void go() {
        d = new Duck();
        d = null;
    }
}