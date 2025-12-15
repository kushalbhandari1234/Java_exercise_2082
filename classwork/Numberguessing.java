import java.util.Scanner;
public class Numberguessing {
   int num;
   int num2;

   Numberguessing(int num){
    this.num = num;
   }
   
   void check(){
       Scanner input = new Scanner(System.in);

     while(true){
        System.out.println("Enter the number");
        num2 = input.nextInt();

        if(num2>num){
            System.out.println("Your number " + num2 + " is greater");
        }

        else if(num2<num){
            System.out.println("Your number " + num2 + " is smaller");
        }
      
        else if(num2 == num){
            System.out.println("Your guess is correct ");
            break; 
        }
     }
   }

   public static void main(String[] aargs){
     Numberguessing ng = new Numberguessing(5);
     ng.check();
   }
}
