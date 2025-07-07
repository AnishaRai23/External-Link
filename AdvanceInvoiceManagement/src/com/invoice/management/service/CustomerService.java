package com.invoice.management.service;

import com.invoice.management.model.Customer;
import com.invoice.management.model.RegularCustomer;
import com.invoice.management.model.PremiumCustomer;
import com.invoice.management.model.CorporateCustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void manageCustomers(Scanner scanner) {
        while (true) {
            System.out.println("\n=== CUSTOMER MANAGEMENT ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Search Customer");
            System.out.println("4. View All Customers");
            System.out.println("5. Return to Main Menu");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter registration date (YYYY-MM-DD): ");
                    LocalDate registrationDate = LocalDate.parse(scanner.nextLine());

                    System.out.println("Select customer type:");
                    System.out.println("1. Regular");
                    System.out.println("2. Premium");
                    System.out.println("3. Corporate");
                    int customerType = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Customer customer;
                    switch (customerType) {
                        case 1:
                            customer = new RegularCustomer(id, name, email, phone, address, registrationDate);
                            break;
                        case 2:
                            System.out.print("Enter discount percentage: ");
                            double discount = scanner.nextDouble();
                            System.out.print("Enter loyalty points: ");
                            int loyaltyPoints = scanner.nextInt();
                            customer = new PremiumCustomer(id, name, email, phone, address, registrationDate, discount, loyaltyPoints);
                            break;
                        case 3:
                            System.out.print("Enter credit limit: ");
                            double creditLimit = scanner.nextDouble();
                            System.out.print("Enter payment terms: ");
                            String paymentTerms = scanner.nextLine();
                            System.out.print("Is tax exempt? (true/false): ");
                            boolean taxExempt = scanner.nextBoolean();
                            customer = new CorporateCustomer(id, name, email, phone, address, registrationDate, creditLimit, paymentTerms, taxExempt);
                            break;
                        default:
                            System.out.println("Invalid customer type.");
                            continue;
                    }

                    addCustomer(customer);
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    // Implement update customer logic
                    System.out.println("Update customer feature is not implemented yet.");
                    break;

                case 3:
                    System.out.print("Enter customer ID to search: ");
                    String searchId = scanner.nextLine();
                    Customer foundCustomer = customers.stream()
                            .filter(c -> c.getId().equalsIgnoreCase(searchId))
                            .findFirst()
                            .orElse(null);
                    if (foundCustomer != null) {
                        System.out.println("Found customer: " + foundCustomer.getName());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nAll Customers:");
                    customers.forEach(c -> System.out.println(
                            "ID: " + c.getId() + 
                            ", Name: " + c.getName() + 
                            ", Email: " + c.getEmail()));
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
