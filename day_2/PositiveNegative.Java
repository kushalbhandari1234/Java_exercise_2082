
import java.util.Scanner;

public class PositiveNegative { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is neither positive nor negative");
        } else {
            System.out.println("The number is positive");
        }

        scanner.close();
    }
}
