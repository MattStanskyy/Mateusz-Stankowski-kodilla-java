package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza: tomato sauce, cheese", description);
    }

    @Test
    public void testBasicPizzaOrderWithCheeseInEdgesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseInEdgesDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithCheeseInEdgesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseInEdgesDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza: tomato sauce, cheese with cheese in edges", description);
    }

    @Test
    public void testBasicPizzaOrderWithAllIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseInEdgesDecorator(theOrder);
        theOrder = new ExtraCheeseIngredientDecorator(theOrder);
        theOrder = new HamIngredientDecorator(theOrder);
        theOrder = new PineappleIngredientDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(136), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseInEdgesDecorator(theOrder);
        theOrder = new ExtraCheeseIngredientDecorator(theOrder);
        theOrder = new HamIngredientDecorator(theOrder);
        theOrder = new PineappleIngredientDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza: tomato sauce, cheese with cheese in edges with extra cheese ingredient with ham ingredient with pineapple ingredient", description);
    }

    @Test
    public void testBasicPizzaOrderWithPineappleAndExtraPineappleGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleIngredientDecorator(theOrder);
        theOrder = new MorePineappleIngredientDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(116), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithPineappleAndExtraPineappleGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineappleIngredientDecorator(theOrder);
        theOrder = new MorePineappleIngredientDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza: tomato sauce, cheese with pineapple ingredient with more pineapple ingredient", description);
    }
}
