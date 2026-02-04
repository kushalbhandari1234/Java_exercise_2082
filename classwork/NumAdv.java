import java.util.Scanner;

class NumAdv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 30;
        int guess, attempts = 0;

        System.out.println("number is from 1-100");

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
                break;
            }

            else if (guess >  55) {
                System.out.println("your number is out of range ");
                
            }

            else if (guess > 35 ) {
                System.out.println("you are  much closer");
                
            }

            if (guess < secretNumber) {
                System.out.println("smaller number");
            } 
            
            
            else {
                System.out.println("greater number");
            }

            
         if (guess < 20 ) {
                System.out.println("your number is out of range ");
                
            }
else if (guess < 20) {
    System.out.println("smaller number");
}

        else if (guess < 25) {
            System.out.println("you are much closer ");
            
        }

        else if (guess <= 29 ) {
            System.out.println("you are a bit away ");
        }
        }

        sc.close();
    }
}
