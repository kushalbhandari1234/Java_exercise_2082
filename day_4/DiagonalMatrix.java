import java.util.Scanner;
public class DiagonalMatrix{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     int matrix[][] = new int[2][2];
  
     for(int i =0; i<2; i++){
        for(int j=0; j<2; j++){
            System.out.println("Enter value of num"+ "[" + i + "]" + "[" + j + "]");
            matrix[i][j] = input.nextInt();
        }
     }

   for (int i = 0; i < 2; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    


    }