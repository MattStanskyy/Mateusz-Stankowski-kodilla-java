package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamIngredientDecorator extends AbstractPizzaOrderDecorator {
    public HamIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " with ham ingredient";
    }
}
