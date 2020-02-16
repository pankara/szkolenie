package com.ey.oop;

public class User {
    private String firstName;
    public int age;
    private String email = "invalid@example.com";

    public User(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void sayHello(){
        String description = String.format("Hello! My name is %s.", this.firstName);
        if (this.age > 0){
            description = description.concat("My age is " + this.age);
        }
        if (!this.email.equals("invalid@example.com")){
            description = description.concat("My email is " + this.email);
        }
        System.out.println(description);
    }

}
