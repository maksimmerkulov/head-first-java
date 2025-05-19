package com.headfirstjava.chapter09;

public class Duck {
    int size;

    public Duck() {
    }

    public Duck(int duckSize) {
        System.out.println("Кря");
        size = duckSize;
        System.out.println("Размер равен " + size);
    }
}