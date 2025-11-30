package day_2;

import java.util.Scanner;

public class Servicemenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to class 11");
        System.out.println("Enter the services you require");
        System.out.println("Services we provide:");
        System.out.println("1 -> Software Development");
        System.out.println("2 -> Automation");
        System.out.println("3 -> Web Development");
        System.out.println("0 -> Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Software Development.");
                break;
            case 2:
                System.out.println("You selected Automation.");
                break;
            case 3:
                System.out.println("You selected Web Development.");
                break;
            case 0:
                System.out.println("Exiting... Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please select 0-3.");
        }

        scanner.close();
    }
}
