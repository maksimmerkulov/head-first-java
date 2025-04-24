package com.headfirstjava.chapter02;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Проигрывание фильма: " + title);
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
    }
}