package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User janusz = new YGeneration("Janusz Polak");
        User mateusz = new Millenials("Matii123");
        User julka = new ZGeneration("xoJulka_15xo");

        //When
        String januszUse = janusz.sharePost();
        String januszUsername = janusz.getUsername();
        System.out.println(januszUsername + " sharing post on: " + januszUse);
        String mateuszUse = mateusz.sharePost();
        String mateuszUsername = mateusz.getUsername();
        System.out.println(mateuszUsername + " sharing post on: " + mateuszUse);
        String julkaUse = julka.sharePost();
        String julkaUsername = julka.getUsername();
        System.out.println(julkaUsername + " sharing post on: " + julkaUse);

        //Then
        assertEquals("Twitter", januszUse);
        assertEquals("Facebook", mateuszUse);
        assertEquals("Snapchat", julkaUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mateusz = new Millenials("Matii123");

        //When
        String mateuszUse = mateusz.sharePost();
        String mateuszUsername = mateusz.getUsername();
        System.out.println(mateuszUsername + " sharing post on: " + mateuszUse);
        mateusz.setSocialPublisher(new TwitterPublisher());
        mateuszUse = mateusz.sharePost();
        System.out.println(mateuszUsername + " sharing post on: " + mateuszUse);

        //Then
        assertEquals("Twitter", mateuszUse);
    }
}
