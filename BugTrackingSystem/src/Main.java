package BugTrackingSystem.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bug {
    String title;
    String status;

    Bug(String title) {
        this.title = title;
        this.status = "Open";
    }

    @Override
    public String toString() {
        return "Bug: " + title + " | Status: " + status;
    }
}

public class Main {
    private static List<Bug> bugList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bug Tracking System started...");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: 1) Add Bug  2) View Bugs  3) Resolve Bug  4) Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter bug title: ");
                    String title = scanner.nextLine();
                    bugList.add(new Bug(title));
                    System.out.println("Bug added successfully!");
                    break;

                case 2:
                    System.out.println("Current Bugs:");
                    for (int i = 0; i < bugList.size(); i++) {
                        System.out.println((i + 1) + ". " + bugList.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter bug number to resolve: ");
                    int bugNum = Integer.parseInt(scanner.nextLine());
                    if (bugNum > 0 && bugNum <= bugList.size()) {
                        bugList.get(bugNum - 1).status = "Resolved";
                        System.out.println("Bug marked as resolved!");
                    } else {
                        System.out.println("Invalid bug number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Bug Tracking System...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
