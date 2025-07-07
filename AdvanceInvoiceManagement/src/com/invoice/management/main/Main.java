package com.invoice.management.main;

import com.invoice.management.service.CustomerService;
import com.invoice.management.service.ProductService;
import com.invoice.management.service.InvoiceService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        ProductService productService = new ProductService();
        InvoiceService invoiceService = new InvoiceService();

        while (true) {
            System.out.println("=== INVOICE MANAGEMENT SYSTEM ===");
            System.out.println("1. Customer Management");
            System.out.println("2. Product Management");
            System.out.println("3. Invoice Operations");
            System.out.println("4. Reports & Analytics");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    customerService.manageCustomers(scanner);
                    break;
                case 2:
                    productService.manageProducts(scanner);
                    break;
                case 3:
                    invoiceService.manageInvoices(scanner);
                    break;
                case 4:
                    // Implement reporting features
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
