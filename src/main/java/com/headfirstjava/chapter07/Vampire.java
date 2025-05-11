package com.headfirstjava.chapter07;

public class Vampire extends Monster {
    boolean frighten(int x) {
        System.out.println("Укусить?");
        return false;
    }
}