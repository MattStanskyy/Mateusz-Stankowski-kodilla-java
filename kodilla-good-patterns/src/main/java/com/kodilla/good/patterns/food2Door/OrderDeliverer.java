package com.kodilla.good.patterns.food2Door;

import com.kodilla.good.patterns.food2Door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.food2Door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.food2Door.producers.HealthyShop;
import com.kodilla.good.patterns.food2Door.producers.ProducerProcess;

public class OrderDeliverer {
    public static ProducerProcess createOrderDeliverer(Shops shop) {
        if (shop.equals(Shops.HEALTHY_SHOP)) {
            return new HealthyShop();
        } else if (shop.equals(Shops.EXTRA_FOOD_SHOP)) {
            return new ExtraFoodShop();
        } else if (shop.equals(Shops.GLUTEN_FREE_SHOP)) {
            return new GlutenFreeShop();
        }
        return null;
    }
}
