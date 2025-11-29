package day_2;
import java.util.scanner;



   public class PositiveNegative{ 

public static void main (String[] args) {
Scanner scanner = new scanner(System.in);

System.out.println("Enter a number");

int number = scanner.nextInt();



if (number<0){
System.out.println("the number is negative");
}

else if(number==0){

    System.out.println("the number is neither positive nor negative");
}


else{
System.out.println("the number is positive");
}
  
scanner.close();

}

}