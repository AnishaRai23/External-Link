package com.invoice.management.model;

public class Product {
    private String id;
    private String name;
    private ProductCategory category;
    private double basePrice;
    private int stockQuantity;

    public Product(String id, String name, ProductCategory category, double basePrice, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.basePrice = basePrice;
        this.stockQuantity = stockQuantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Getters and Setters for other fields
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
