package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean iseven = LogicNot.isEven(6);
        System.out.println(iseven);
        boolean ispos = LogicNot.isPositive(5);
        System.out.println(ispos);
        boolean noteven = LogicNot.notEven(7);
        System.out.println(noteven);
        boolean notpos = LogicNot.notPositive(-8);
        System.out.println(notpos);
        boolean notevenandpositive = LogicNot.notEvenAndPositive(7);
        System.out.println(notevenandpositive);
        boolean evenornotpositive = LogicNot.evenOrNotPositive(-7);
        System.out.println(evenornotpositive);
    }
}
