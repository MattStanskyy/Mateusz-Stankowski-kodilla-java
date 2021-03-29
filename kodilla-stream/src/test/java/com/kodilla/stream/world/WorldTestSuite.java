package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal(38000000));
        Country country2 = new Country("Japanese", new BigDecimal(126000000));
        Country country3 = new Country("South Korea", new BigDecimal(52000000));
        Country country4 = new Country("Kamerun", new BigDecimal(24000000));
        Country country5 = new Country("Germany", new BigDecimal(83000000));
        Country country6 = new Country("Nigeria", new BigDecimal(196000000));
        Country country7 = new Country("Uganda", new BigDecimal(43000000));
        Country country8 = new Country("Italy", new BigDecimal(60000000));
        Country country9 = new Country("China", new BigDecimal(1393000000));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");
        continent1.addCounty(country1);
        continent2.addCounty(country2);
        continent2.addCounty(country3);
        continent3.addCounty(country4);
        continent1.addCounty(country5);
        continent3.addCounty(country6);
        continent3.addCounty(country7);
        continent1.addCounty(country8);
        continent2.addCounty(country9);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal peopleQuantityAll = world.getPeopleQuantityAll();

        //Then
        Assert.assertEquals(new BigDecimal("2015000000"),peopleQuantityAll);
    }
}
