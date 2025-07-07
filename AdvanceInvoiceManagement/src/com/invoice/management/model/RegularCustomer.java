package com.invoice.management.model;

import java.time.LocalDate;

public class RegularCustomer extends Customer {
    public RegularCustomer(String id, String name, String email, String phone, String address, LocalDate registrationDate) {
        super(id, name, email, phone, address, registrationDate);
    }

    @Override
    public String getCustomerTypeSpecificInfo() {
        return "Regular customer with no special features.";
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }
}
