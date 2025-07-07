package com.invoice.management.service;

import com.invoice.management.model.Product;
import com.invoice.management.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product findProductByName(String name) {
        return products.stream()
                      .filter(p -> p.getName().equalsIgnoreCase(name))
                      .findFirst()
                      .orElse(null);
    }

    public void manageProducts(Scanner scanner) {
        while (true) {
            System.out.println("\n=== PRODUCT MANAGEMENT ===");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Return to Main Menu");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.println("Select category:");
                    for (ProductCategory category : ProductCategory.values()) {
                        System.out.println((category.ordinal() + 1) + ". " + category);
                    }
                    int catIndex = scanner.nextInt();
                    ProductCategory category = ProductCategory.values()[catIndex - 1];
                    System.out.print("Enter base price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter stock quantity: ");
                    int quantity = scanner.nextInt();
                    
                    addProduct(new Product(id, name, category, price, quantity));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    System.out.println("\nAll Products:");
                    products.forEach(p -> System.out.println(
                        "ID: " + p.getId() + 
                        ", Name: " + p.getName() + 
                        ", Category: " + p.getCategory() + 
                        ", Price: $" + p.getBasePrice() + 
                        ", Stock: " + p.getStockQuantity()));
                    break;
                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    Product found = findProductByName(searchName);
                    if (found != null) {
                        System.out.println("Found product: " + found.getName());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
