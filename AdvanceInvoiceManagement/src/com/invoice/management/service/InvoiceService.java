package com.invoice.management.service;

import com.invoice.management.model.Invoice;
import com.invoice.management.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceService {
    private List<Invoice> invoices = new ArrayList<>();

    public void manageInvoices(Scanner scanner) {
        while (true) {
            System.out.println("\n=== INVOICE MANAGEMENT ===");
            System.out.println("1. Create Invoice");
            System.out.println("2. View All Invoices");
            System.out.println("3. Return to Main Menu");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    createInvoice(scanner);
                    break;
                case 2:
                    viewAllInvoices();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void createInvoice(Scanner scanner) {
        System.out.print("Enter invoice number: ");
        String invoiceNumber = scanner.nextLine();
        
        // For simplicity, let's assume we have a method to get products
        List<Product> products = new ArrayList<>(); // You would normally fetch this from ProductService

        // Here you can add logic to add products to the invoice
        // For example, you can prompt the user to enter product details

        Invoice invoice = new Invoice(invoiceNumber, products);
        invoices.add(invoice);
        System.out.println("Invoice created successfully!");
    }

    private void viewAllInvoices() {
        System.out.println("\nAll Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println("Invoice Number: " + invoice.getInvoiceNumber() + 
                               ", Total Amount: $" + invoice.getTotalAmount());
        }
    }
}

