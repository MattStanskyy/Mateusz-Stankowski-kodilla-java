package com.kodilla.good.patterns.food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {
        Order order = new Order("Pineapple", 15, Shops.HEALTHY_SHOP);
        Order order1 = new Order("Tomato", 2, Shops.EXTRA_FOOD_SHOP);
        Order order2 = new Order("Potato", 44, Shops.GLUTEN_FREE_SHOP);
        OrderService orderService = new OrderService();
        orderService.order(order);
        orderService.order(order1);
        orderService.order(order2);
    }
}
