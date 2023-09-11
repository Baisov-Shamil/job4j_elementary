package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int prime = 2; prime < number; prime++) {
            if (number % prime == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
