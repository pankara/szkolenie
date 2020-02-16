package com.ey.homework;

import java.util.ArrayList;
import java.util.List;

public class Training {
    protected String name;
    protected List<String> participantEmails = new ArrayList<>();
    protected int trainingPeriodInHours = 0;
    protected static final int MINIMUM_NUMBER_OF_PARTICIPANT = 4;

    public Training(String name) {
        this.name = name;
    }

    public void addParticipantEmail(String email) {
        participantEmails.add(email);
    }

    public List<String> getParticipantEmails() {
        return participantEmails;
    }

    public int getNumberOfParticipants() {
        return participantEmails.size();
    }

    public void setTrainingPeriodInHours(int trainingPeriodInHours) {
        this.trainingPeriodInHours = trainingPeriodInHours;
    }

    public void start() {
        if (canTrainingBeStarted()) {
            System.out.println("Training is starting now!");
        } else {
            System.out.printf("There is not enough participants enrolled. Required: %d", MINIMUM_NUMBER_OF_PARTICIPANT);
        }
    }

    public String toString() {
        return String.format("Training name: %s\n"
                        + "Training period [hours]: %s\n"
                        + "Currently enrolled participants: %d\n",
                name,
                trainingPeriodInHours,
                getNumberOfParticipants()
        );
    }

    public Integer howManyMoreParticipantsRequiredToStart() {
        int participantsLeft = getNumberOfParticipants() - MINIMUM_NUMBER_OF_PARTICIPANT;
       if (participantsLeft >= 0){
           System.out.print("There is enough participants to start the training ");
       } else {
           System.out.printf("Participants left to start training %s",participantsLeft);
       }
       return participantsLeft;
    }

    public Boolean canTrainingBeStarted() {
        if (getNumberOfParticipants() >= MINIMUM_NUMBER_OF_PARTICIPANT) {
            return true;
        } else {
            return false;
        }
    }
}
