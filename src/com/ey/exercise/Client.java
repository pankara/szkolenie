package com.ey.exercise;

public class Client {
    private String email;
    private int age;
    private boolean isLogged = false;
    private boolean isDeleted = false;
    private static final String VALID_PASSWORD = "Pa55w0rd!";

    public Client(String email, int age) {
        this.email = email;
        this.age = age;
    }

    public void login(String password) {
        if (this.isDeleted()) {
            System.out.println("Account deleted!");
        } else if (!password.equals(VALID_PASSWORD)) {
            System.out.println("Password is invalid!");
        } else {
            System.out.println("Logged in successfully!");
            this.isLogged = true;
        }
    }

    public void deleteAccount() {
        if (this.isLogged()) {
            this.isLogged = false;
            this.isDeleted = true;
            System.out.println("Account has been successfully deleted.");
        } else {
            System.out.println("Log in to delete your account.");
        }
    }

    protected boolean isLogged() {
        return this.isLogged;
    }

    protected boolean isDeleted() {
        return this.isDeleted;
    }
}
