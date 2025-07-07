package com.invoice.management.model;

import java.time.LocalDate;

public abstract class Customer {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDate registrationDate;

    public Customer(String id, String name, String email, String phone, String address, LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.registrationDate = registrationDate;
    }

    public abstract String getCustomerTypeSpecificInfo();

    public abstract String getEmail();

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    // Getters and Setters
}
