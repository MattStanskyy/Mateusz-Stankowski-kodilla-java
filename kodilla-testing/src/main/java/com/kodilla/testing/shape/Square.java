package com.kodilla.testing.shape;

class Square implements Shape {
    private String name = "Square";
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return length * 2;
    }
}
