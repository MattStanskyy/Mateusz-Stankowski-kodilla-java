package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductsOrderRepository implements OrderRepository{
    public boolean createOrder(User user, LocalDateTime orderTime, Product product) {
        System.out.println("Order sent for execution");
        return true;
    }
}
