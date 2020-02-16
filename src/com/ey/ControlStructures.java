package com.ey;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class ControlStructures {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        if (a > b) {
            System.out.println("Math is wrong!");
        } else {
            System.out.println("Math is correct!");
        }
        System.out.println("I'm always here!");

        double temperature = 20.1;

        if (temperature > 20) {
            System.out.println("It's warm");
        } else if (temperature > 10) {
            System.out.println("It's chill");
        } else {
            System.out.println("It's cold");
        }

        Random random = new Random();
        int score = random.nextInt(400) + 1;
        System.out.println("Generated score: " + score);

        if (score >= 200) {
            System.out.println("You win!");
        } else if (score > 100) {
            System.out.println("Keep trying!");
        } else {
            System.out.println("Looser!");
        }

        String manufacturer = "Jeep";
        switch (manufacturer) {
            case "Toyota":
                System.out.println("Japan");
                break;
            case "BMW":
                System.out.println("Germany");
                break;
            case "KIA":
                System.out.println("Korea");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        Locale polishLocale = new Locale("pl");
        Faker fake = new Faker(polishLocale);
        String randomCity = fake.address().city();
        String randomEmail = fake.internet().emailAddress();
        String randomPhone = fake.phoneNumber().phoneNumber();
        System.out.println(randomCity);

        String randomFirstName = fake.name().firstName();
        System.out.println(randomFirstName);

    }
}
