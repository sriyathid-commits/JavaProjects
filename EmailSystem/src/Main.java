package EmailSystem.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Email {
    String sender;
    String recipient;
    String content;

    Email(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public String toString() {
        return "From: " + sender + " | To: " + recipient + " | Message: " + content;
    }
}

public class Main {
    private static List<Email> inbox = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Email System initialized...");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: 1) Send Email  2) View Inbox  3) Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter sender: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter recipient: ");
                    String recipient = scanner.nextLine();
                    System.out.print("Enter message: ");
                    String content = scanner.nextLine();
                    inbox.add(new Email(sender, recipient, content));
                    System.out.println("Email sent!");
                    break;

                case 2:
                    System.out.println("Inbox:");
                    for (Email e : inbox) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("Exiting Email System...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
