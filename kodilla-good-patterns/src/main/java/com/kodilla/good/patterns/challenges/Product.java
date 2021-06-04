package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private int productNumber;
    private int quanityProduct;

    public Product(String productName, int productNumber, int quanityProduct) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.quanityProduct = quanityProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getQuanityProduct() {
        return quanityProduct;
    }
}
