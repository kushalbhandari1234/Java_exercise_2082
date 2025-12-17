import java.util.Scanner;

class NumAdv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 93;
        int guess, attempts = 0;

        System.out.println("Guess the number (1 to 100)");

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
                break;
            }

            if (guess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        sc.close();
    }
}
