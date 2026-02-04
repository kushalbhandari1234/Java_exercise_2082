import java.util.Scanner;

public class Userinputarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        scanner.close();
    }
}
