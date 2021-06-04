package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Matthew", "Stankowsky", "MattStansky", "MattStansky@mail.com");
        LocalDateTime orderTime = LocalDateTime.of(2020, 06, 04, 20, 20);
        Product product = new Product("Wizir", 12345, 2);

        return new OrderRequest(user, orderTime, product);
    }
}
