import java.util.Scanner;

public class Print_Spiral_Order_Matrix {
    private static int m,n;
    private static int[][] matrix;

    public static void main(String[] args) {
        System.out.println("\nSpiral order of a Matrix\n");
        takeInput();
        printMatrix();
        printSpiralOrder();
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

    private static void printSpiralOrder(){
        int lower_limit_i=-1,upper_limit_i=m,lower_limit_j=-1,upper_limit_j=n,i=0,j=0;
        while(true){
            if(j<upper_limit_j)
            while(j<upper_limit_j){
                System.out.print(matrix[i][j]+" ");
                j++;
            }
            else
            break;
            j--;
            i++;
            lower_limit_i++;
            if(i<upper_limit_i)
            while(i<upper_limit_i){
                System.out.print(matrix[i][j]+" ");
                i++;
            }
            else
            break;
            i--;
            j--;
            upper_limit_j--;
            if(j>lower_limit_j)
            while(j>lower_limit_j){
                System.out.print(matrix[i][j]+" ");
                j--;
            }
            else
            break;
            j++;
            i--;
            upper_limit_i--;
            if(i>lower_limit_i)
            while(i>lower_limit_i){
                System.out.print(matrix[i][j]+" ");
                i--;
            }
            else
            break;
            i++;
            j++;
            lower_limit_j++;
        }
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
