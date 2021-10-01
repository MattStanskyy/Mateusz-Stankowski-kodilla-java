package com.kodilla.good.patterns.food2Door.producers;

import com.kodilla.good.patterns.food2Door.Order;

public class ExtraFoodShop implements ProducerProcess {

    @Override
    public void process(Order order) {
        System.out.println("Order from ExtraFoodShop: " + order.getProduct() + ", quantity: " + order.getProductQuantity());
    }
}
