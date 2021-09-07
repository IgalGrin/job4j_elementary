package ru.job4j.converter;

public class Converter0 {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        /*float rsl = value / 60; /* формула перевода рублей в доллары. */
        /*return rsl;*/
        return  -1;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float expectedDollar = 2.33f;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.33. Test result : " + passedDollar);
    }
}
