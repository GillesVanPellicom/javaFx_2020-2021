package me.gillesvanpellicom.utils;


import java.util.concurrent.ThreadLocalRandom;

public class IntGenerator {

    public static int generateInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static int generateInt(int max) {
        return (int) (Math.random() + (max + 1));
    }
}
