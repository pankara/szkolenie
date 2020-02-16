package com.ey;


import com.github.javafaker.Faker;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        String[] emails = {"a@example.com", "b@example.com", "c@example.com"};


        String[] trainingParticipantsNames = new String[10];
        trainingParticipantsNames[0] = "Adrian Gonciarz";

        String firstElement = trainingParticipantsNames[0];
        String secondElement = trainingParticipantsNames[1];

        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(trainingParticipantsNames[2]);
        System.out.println(trainingParticipantsNames[9]);

        trainingParticipantsNames[7] = "Patryk Okoń";
        System.out.println(Arrays.toString(trainingParticipantsNames));
        int participantsNumber = trainingParticipantsNames.length;
        System.out.println(participantsNumber);

        String[] movieHeroes = new String[5];
        movieHeroes[0] = "Captain America";
        movieHeroes[1] = "Wolverine";
        movieHeroes[2] = "Batman";
        movieHeroes[3] = "Joker";
        movieHeroes[4] = "Iron Man";
        System.out.println("Third hero: " + movieHeroes[3]);
        System.out.println("Number of heroes: " + movieHeroes.length);

        ArrayList<String> friendsPhones = new ArrayList<>();
        friendsPhones.add("+48111222333");
        friendsPhones.add("+48111222334");
        friendsPhones.add(1, "+48222223334");
        friendsPhones.addAll(Arrays.asList("+48111", "+48113"));

        System.out.println("Friends phone list size: " + friendsPhones.size());

        System.out.println(friendsPhones.get(0));
        int lastElementIndex = friendsPhones.size() - 1;
        System.out.println(friendsPhones.get(lastElementIndex));

        friendsPhones.set(1, "+498887777666");
        System.out.println(friendsPhones);

        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(1, 5);
        oddNumbers.addAll(Arrays.asList(7,9));
        oddNumbers.set(3, 11);
        System.out.println(oddNumbers);

        HashMap<String, String> userEmailLoginMap = new HashMap<>();
        userEmailLoginMap.put("admin@example.com", "123admin987");
        userEmailLoginMap.put("client1@example.com", "johny_bravo2");
        userEmailLoginMap.put("manager6@example.com", "i_am_the_boss");

        System.out.println(userEmailLoginMap.get("client1@example.com"));

        userEmailLoginMap.put("client1@example.com", "johny_bravo666");
        System.out.println(userEmailLoginMap.get("client1@example.com"));

        HashMap<String, Integer> userEmailIdMap = new HashMap<>();
        userEmailIdMap.put("a1@example.com", 789);
        userEmailIdMap.put("a2@example.com", 99399);
        userEmailIdMap.put("a3@example.com", 1304040);

        System.out.println(userEmailIdMap);

        Locale polish = new Locale("pl_PL");
        Faker faker = new Faker(polish);

        HashMap<String, String> randomEmailPhoneMap = new HashMap<>();
        String randomEmail = faker.internet().emailAddress();
        String randomPhone = faker.phoneNumber().phoneNumber();
        randomEmailPhoneMap.put(randomEmail,randomPhone);
        randomEmailPhoneMap.put(faker.internet().emailAddress(),faker.phoneNumber().phoneNumber());
        randomEmailPhoneMap.put(faker.internet().emailAddress(),faker.phoneNumber().phoneNumber());

        System.out.println(randomEmailPhoneMap);

        HashMap<String, Object> userMap = new HashMap<>();
        userMap.put("email", "email1@example.com");
        userMap.put("phone", "+48111222333");
        userMap.put("age", 33);

        Set<String> keys = userMap.keySet();
        System.out.println(keys);

        for (String key:keys) {
            System.out.println(key);
        }
    }
}
