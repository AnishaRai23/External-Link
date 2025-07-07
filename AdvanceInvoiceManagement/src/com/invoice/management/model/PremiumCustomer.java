package com.invoice.management.model;

import java.time.LocalDate;

public class PremiumCustomer extends Customer {
    private double discountPercentage;
    private int loyaltyPoints;

    public PremiumCustomer(String id, String name, String email, String phone, String address, LocalDate registrationDate, double discountPercentage, int loyaltyPoints) {
        super(id, name, email, phone, address, registrationDate);
        this.discountPercentage = discountPercentage;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getCustomerTypeSpecificInfo() {
        return "Discount Percentage: " + discountPercentage + "%, Loyalty Points: " + loyaltyPoints;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }

    // Getters and Setters
}
