package ru.job4j.condition;
//Maven сборка
public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie "; //конкатенация
        int year = 2021;
        idea += year; //конкатенация
        System.out.println(idea);
    }
}