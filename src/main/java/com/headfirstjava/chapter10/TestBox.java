package com.headfirstjava.chapter10;

public class TestBox {
    Integer i;
    int j;

    public void go() {
        i = 5;
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
}