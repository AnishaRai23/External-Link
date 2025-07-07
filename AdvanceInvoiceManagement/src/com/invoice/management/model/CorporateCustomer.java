package com.invoice.management.model;

import java.time.LocalDate;

public class CorporateCustomer extends Customer {
    private double creditLimit;
    private String paymentTerms;
    private boolean taxExempt;

    public CorporateCustomer(String id, String name, String email, String phone, 
                           String address, LocalDate registrationDate,
                           double creditLimit, String paymentTerms, boolean taxExempt) {
        super(id, name, email, phone, address, registrationDate);
        this.creditLimit = creditLimit;
        this.paymentTerms = paymentTerms;
        this.taxExempt = taxExempt;
    }

    @Override
    public String getCustomerTypeSpecificInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerTypeSpecificInfo'");
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }
    
    // Getters and setters here
}


