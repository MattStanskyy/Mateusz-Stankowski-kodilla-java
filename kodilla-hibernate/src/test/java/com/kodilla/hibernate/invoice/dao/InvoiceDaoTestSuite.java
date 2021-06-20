package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Invoice invoice = new Invoice("54321/21");
        Invoice invoice2 = new Invoice("12345/21");

        Item item1 = new Item(new Product("Computer"), new BigDecimal(13000), 1, new BigDecimal(13000));
        Item item2 = new Item(new Product("Freezer"), new BigDecimal(10000), 2, new BigDecimal(20000));
        Item item3 = new Item(new Product("Washing machine"), new BigDecimal(4000), 1, new BigDecimal(4000));
        Item item4 = new Item(new Product("Headphones"), new BigDecimal(500), 4, new BigDecimal(2000));
        Item item5 = new Item(new Product("Lamp"), new BigDecimal(700), 3, new BigDecimal(2100));

        invoice.getItems().add(item1);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);
        int invoiceId = invoice.getId();
        int invoice2Id = invoice2.getId();

        //Then
        assertNotEquals(0, invoiceId);
        assertNotEquals(0, invoice2Id);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
        invoiceDao.deleteById(invoice2Id);
    }

}
