package com.ey.oop;

public class Restaurant {
    private String name;
    private int numberOfTables;
    private String restaurantMenu = "Soup - 11.99\nSteak - 50.80";


    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.numberOfTables = numberOfTables;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public String menu() {
        return this.restaurantMenu;
    }

    public int freeTables() {
        return this.numberOfTables;
    }

}
