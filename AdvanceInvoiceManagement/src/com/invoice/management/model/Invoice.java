package com.invoice.management.model;

import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private List<Product> products;
    private double totalAmount;

    public Invoice(String invoiceNumber, List<Product> products) {
        this.invoiceNumber = invoiceNumber;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getBasePrice).sum();
    }

    // Getters and Setters
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
