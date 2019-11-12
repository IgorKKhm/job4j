package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        return (p / (k + 1) / 2 * k) * (p / (k + 1) / 2);
    }

    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result);
    }
}
