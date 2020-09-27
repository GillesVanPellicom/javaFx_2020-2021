package me.gillesvanpellicom.utils;

public class StringGenerator {

    public static String generateRandomString(int lenght) {
        String output = "";
        for (int i = 0; i < lenght; i++) {
            char temp = (char) IntGenerator.generateInt(33, 126);
            output = output + temp;
        }
        return output;
    }

    public static String generateRandomString(int lenght, int boundA, int boundB) {
        String output = "";
        for (int i = 0; i < lenght; i++) {
            char temp = (char) IntGenerator.generateInt(boundA, boundB);
            output = output + temp;
        }
        return output;
    }
}
