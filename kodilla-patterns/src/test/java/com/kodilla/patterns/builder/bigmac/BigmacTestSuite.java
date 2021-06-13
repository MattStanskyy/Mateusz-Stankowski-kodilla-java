package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("classic")
                .ingredient("pickle")
                .burgers(2)
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cheese")
                .sauce("barbecue")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whichIngredientChosen = bigmac.getIngredients().get(0);
        int howManyBurgers = bigmac.getBurgers();
        String whichBunChosen = bigmac.getBun();
        String whichSauceChosen = bigmac.getSauce();

        //Then
        assertEquals(5, howManyIngredients);
        assertEquals("pickle", whichIngredientChosen);
        assertEquals(2, howManyBurgers);
        assertEquals("classic", whichBunChosen);
        assertEquals("barbecue", whichSauceChosen);
    }
}
