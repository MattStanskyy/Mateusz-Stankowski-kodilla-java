package com.kodilla.testing.shape;

class Circle implements Shape {
    private String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return radius * radius * 3.14 ;
    }
}
