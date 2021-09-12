package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean number = left > right;
        return number ? left : right;
    }

    public static void main(String[] args) {
        int res = Max.max(18, 18);
        System.out.println(res);
    }
}
