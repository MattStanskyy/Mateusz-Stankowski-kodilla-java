package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(){
        System.out.println("Error - You can't plan this trip");
    }
}
