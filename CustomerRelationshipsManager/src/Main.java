package CustomerRelationshipsManager.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    String name;
    String email;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " | Email: " + email;
    }
}

public class Main {
    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Customer Relationships Manager running...");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: 1) Add Customer  2) View Customers  3) Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer email: ");
                    String email = scanner.nextLine();
                    customers.add(new Customer(name, email));
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    System.out.println("Customer List:");
                    for (Customer c : customers) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.println("Exiting CRM...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
