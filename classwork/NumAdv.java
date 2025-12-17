import java.util.Scanner;

class NumAdv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 600;
        int guess, attempts = 0;

        System.out.println("Guess the number (0 to 1000)");

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
                break;
            }

            else if (guess > secretNumber + 800) {
                System.out.println("your number is miles away");
                
            }

            else if (guess < secretNumber -400 ) {
                System.out.println("your number is much more away");
                
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
