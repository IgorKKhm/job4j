package ru.job4j.calculator;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int dollarRub = dollarToRuble(3);
        int euroRub = euroToRuble(4);
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("120 rubles are " + dollar + " dollars.");
        System.out.println("3 dollars are " + dollarRub + " rubles");
        System.out.println("4 euros are " + euroRub + " rubles");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        in = 120;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);

        in = 2;
        expected = 120;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed);


        expected = 140;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euros are 140 rubles. Test result : " + passed);


    }
}
