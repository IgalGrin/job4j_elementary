package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result;
        String w = new String(word);
        String c = new String(post);
            result = w.endsWith(c);
        return result;
    }
}
