package com.kodilla.good.patterns.food2Door;

import com.kodilla.good.patterns.food2Door.producers.ProducerProcess;

public class OrderService {
    public void order(Order order) {
        ProducerProcess producerProcess = OrderDeliverer.createOrderDeliverer(order.getShop());
        producerProcess.process(order);
    }
}
