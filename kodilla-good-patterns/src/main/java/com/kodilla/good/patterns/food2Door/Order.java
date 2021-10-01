package com.kodilla.good.patterns.food2Door;

public class Order {

    private String productName;
    private int productQuantity;
    private Shops shops;

    public Order(String productName, int productQuantity, Shops shops) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.shops = shops;
    }

    public Shops getShop() {
        return shops;
    }

    public String getProduct() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
