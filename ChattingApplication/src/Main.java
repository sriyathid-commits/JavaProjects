package ChattingApplication.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> chatHistory = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Chatting Application launched...");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your message (or type 'exit' to quit): ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Closing chat. Goodbye!");
                break;
            }

            // Save message to history
            chatHistory.add(message);

            // Echo back
            System.out.println("You said: " + message);

            // Show chat history
            System.out.println("Chat history: " + chatHistory);
        }

        scanner.close();
    }
}
