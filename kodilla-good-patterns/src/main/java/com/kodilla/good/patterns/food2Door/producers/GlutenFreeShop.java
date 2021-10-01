package com.kodilla.good.patterns.food2Door.producers;

import com.kodilla.good.patterns.food2Door.Order;

public class GlutenFreeShop implements ProducerProcess {

    @Override
    public void process(Order order) {
        System.out.println("Order from GlutenFreeShop: " + order.getProduct() + ", quantity: " + order.getProductQuantity());
    }
}
