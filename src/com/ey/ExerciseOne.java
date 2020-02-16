package com.ey;

import com.github.javafaker.Faker;

import java.util.Locale;

public class ExerciseOne {
    public static void main(String[] args) {
        Faker fake = new Faker(new Locale("pl"));
        String randomFirstName = fake.name().firstName();
        String lowercaseFirstName = randomFirstName.toLowerCase();
        System.out.println("Wylosowane imię: " + randomFirstName);

        if (lowercaseFirstName.contains("m")) {
            System.out.println("M jak miłość");
        } else if (lowercaseFirstName.contains("k")) {
            System.out.println("K jak krowa");
        } else {
            System.out.println("Inne literki");
        }
    }
}
