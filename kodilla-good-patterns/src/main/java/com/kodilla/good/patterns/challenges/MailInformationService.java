package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {
    public void inform(User user, Product product){
        System.out.println("User of mail: " + user.getMailAdress() + ", " + user.getName() + " " + user.getSurname() + " as " + user.getNick() + " ordered " + product.getQuanityProduct() + " of " + product.getProductName() + ", number of product: " + product.getProductNumber());
    }
}
