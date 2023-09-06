package com.karel.program;

import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALPHABET.length());
            char randomChar = ALPHABET.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);

        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}