package com.headfirstjava.chapter11;

public class TestExceptions {
    static void doRisky(String test) throws ScaryException {
        System.out.println("Начало опасного метода");
        if ("Да".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("Конец опасного метода");
        return;
    }

    public static void main(String[] args) {
        String test = "Да";
        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        } catch (ScaryException se) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец main");
    }
}