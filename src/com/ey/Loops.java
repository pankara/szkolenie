package com.ey;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Obecna wartość wskaźnika i: " + i);
        }

        List<Integer> squaresOfNumbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            int square = (int) Math.pow(i, 2);
            squaresOfNumbers.add(square);
        }
        System.out.println(squaresOfNumbers);

        String[] randomEmails = new String[50];
        Faker fake = new Faker();

        for (int i = 0; i < randomEmails.length; i++) {
            String randomEmail = fake.internet().emailAddress();
            randomEmails[i] = randomEmail;
        }
        System.out.println(Arrays.toString(randomEmails));

        for (String email : randomEmails) {
            System.out.println(email.toUpperCase());
        }

        List<Integer> randomAges = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int randomAge = new Random().nextInt(100) + 1;
            randomAges.add(randomAge);
        }
        System.out.println(randomAges);

        List<Boolean> agesToAdults = new ArrayList<>();
        for (Integer age : randomAges) {
            boolean isAdult = false;
            if (age >= 18) {
                isAdult = true;
            }
            System.out.printf("User age: %s, is adult: %s\n", age, isAdult);
            agesToAdults.add(isAdult);
        }

        Integer[] userIds = {111, 324, 765, 789, 444, 230, 101};

        for (int id : userIds) {
            if (id % 2 == 0) {
                System.out.println("Is even");
            } else {
                System.out.println("Is odd");
            }
        }

        int k = 0;
        while (k < 10) {
            System.out.println("Wartość wskaźnika: " + k);
            k += 3;
        }

        int n = 1;
        while (n <= 21) {
            int thirdPower = (int) Math.pow(n, 3);
            System.out.printf("Liczba: %s, potęga: %s\n", n, thirdPower);
            n += 4;
        }
    }
}
