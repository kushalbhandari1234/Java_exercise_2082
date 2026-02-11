import java.util.Scanner;

public class SubtractionMatrix {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matrixA[][] = new int[2][3];
        int matrixB[][] = new int[2][3];
        int sub[][] = new int[2][3];

        System.out.println("Enter elements of first matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                matrixB[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sub[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Subtraction of matrices:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}
