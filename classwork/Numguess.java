import java.util.Scanner;
public class Numguess {
   int num;
   int num2;

Numguess(int num){
    this.num = num;
   }

   void check(){
       Scanner input = new Scanner(System.in);

     while(true){
        System.out.println("Enter the number");
        num2 = input.nextInt();

        if(num2 > num + 5){
            System.out.println("number is much greater");
        }
        else if(num2 > num ){
            System.out.println("number is greater");
        }
        else if(num2 < num - 5){
            System.out.println("number is much smaller");
        }
        else if(num2 < num){
            System.out.println("number is smaller");
        }
        else{
            System.out.println("Your guess is correct ");
            break; 
        }
     }
     input.close(); 
   }

   public static void main(String[] args){
     Numguess ng = new Numguess(2);
     ng.check();
   }
}
