package com.kodilla.good.patterns.challenges;


public class ApplicationPOS {
    public static void main(String[] args) {
    OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
    OrderRequest orderRequest = orderRequestRetriver.retrive();

    ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), new ProductsOrderService(), new ProductsOrderRepository());
    productOrderService.process(orderRequest);
    }
}
