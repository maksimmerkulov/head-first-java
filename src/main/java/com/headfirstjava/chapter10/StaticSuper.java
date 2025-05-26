package com.headfirstjava.chapter10;

public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}