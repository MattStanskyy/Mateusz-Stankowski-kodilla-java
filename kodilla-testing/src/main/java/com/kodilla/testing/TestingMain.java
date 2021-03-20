package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] argd) {

        Calculator calculator = new Calculator();

        int resultOfAdd = calculator.add(6, 3);
        int resultOfSubstract = calculator.substract(6, 3);

        if (resultOfAdd == 9) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if (resultOfSubstract == 9) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}
