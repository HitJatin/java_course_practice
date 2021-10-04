import java.util.Scanner;

public class Print_Transpose_Matrix {
    private static int m,n;
    private static int[][] matrix;
    public static void main(String[] args) {
        System.out.println("\nTranspose of a Matrix\n");
        takeInput();
        printMatrix();
        printTranspose();
    }
    private static void printTranspose(){
        System.out.println("\nTranspose of the Matrix\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    private static void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of Matrix");
        System.out.print("m:");
        m=sc.nextInt();
        System.out.print("n:");
        n=sc.nextInt();
        System.out.println("\nPlease enter the Matrix\n");
        matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    private static void printMatrix(){
        System.out.println("\nHere is the Matrix\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
