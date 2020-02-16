package com.ey.homework;

public class Zadanie {
    public static void main(String[] args) {
    Training traning = new Training("TestAutomationInJava");
    traning.addParticipantEmail("test@example.com");
    traning.addParticipantEmail("test2@example.com");
    traning.addParticipantEmail("test3@example.com");
    traning.addParticipantEmail("test4@example.com");
    traning.addParticipantEmail("test4@example.com");
    traning.addParticipantEmail("test4@example.com");

        System.out.println(traning.getNumberOfParticipants());
        System.out.println(traning.getParticipantEmails());
        System.out.println(traning.toString());


        traning.start();

    }
}
