package com.ey;

public class Main {

    public static void main(String[] args) {
//        Tu jest mój komentarz
        /*
        Wiele linijek
        komentarza
        */
        System.out.println("Hello world!");
        System.out.println("My name is Adrian");

        String name = new String();
        name = "Adrian";

        String friendsName = "Dawid";
        Integer myAge = 31;
        Float size = null;
        double myHeight = 1.82;
        float myWeight = (float) 75.1;
        float myWeight2 = 75.1f;

        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println(c);

        Integer r = 3;
        double pi = 3.1415;
        double l = 2 * r * pi;
        System.out.println(l);

        Integer userID = null;

        boolean isSunnyDay = false;
        boolean doWeHaveTraining = true;
        boolean isSunnyDayAndWeHaveTraining = isSunnyDay && doWeHaveTraining;
        System.out.println(isSunnyDayAndWeHaveTraining);

        boolean isAGreaterThanB = a > b;
        boolean isAEqualB = a == b;
        System.out.println("A is greater then B: " + isAGreaterThanB);
        System.out.println("A is equal B: " + isAEqualB);


        double number = 3.4;
        double square = Math.pow(number, 2);
        int squareRounded = (int) Math.round(square);
        int squareToInt = (int) square;
        System.out.println("Value of square:" + square);
        System.out.println("Value of square rounded:" + squareRounded);
        System.out.println("Value of square int:" + squareToInt);
    }
}
