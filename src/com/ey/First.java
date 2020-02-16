package com.ey;

public class First {
    public static void main(String[] args) {
        String myFavouriteMovie = "Ghost Dog";
        System.out.println("Mój ulubiony film to " + myFavouriteMovie);
        System.out.printf("Mój ulubiony film to %s\n", myFavouriteMovie);

        int age = 31;
        String phone = "+487466632";
        System.out.printf("Moj wiek to %s.\nMoj numer telefonu to %s.\n", age, phone);
        String description = String.format("Moj wiek to %s.\nMoj numer telefonu to %s.", age, phone);

        double temperateInCelsius = 14.5;
        double temperateInFahrenheit = temperateInCelsius * 1.8 + 32;
        System.out.println(temperateInFahrenheit);

        int r = 3;
        double pi = 3.1415;
        double circleArea = pi * Math.pow(r, 2);
        double circleCircumference = 2 * pi * r;

        System.out.printf("Pole koła: %s\n", circleArea);
        System.out.printf("Obwód koła: %s\n", circleCircumference);

        int start = 41;
        int end = 40;
        boolean startBeforeEnd = start > end;
        System.out.println("Start before end: " + startBeforeEnd);

        int myAge = 31;
        double myHeightInMeters = 1.82;
        String myEmail = "adrian.gonciarz@gmail.com";

        System.out.printf(
                "Mój wiek to %s.\nMój wzrost to %s.\nMój email to %s\n",
                myAge, myHeightInMeters, myEmail
        );
    }
}
