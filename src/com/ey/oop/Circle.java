package com.ey.oop;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double area() {
        return Math.PI * this.radius * this.radius;
    }

    public Double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public void describe() {
        System.out.printf("Radius: %s \nArea %s\nCircumference %s\n",
                this.radius, this.area(), this.circumference()
        );
    }
}
