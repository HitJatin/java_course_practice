package Patterns;

public class Pattern_Half_Pyramid {
    /**
     * Print the Pattern 
     *  *
     *  **
     *  ***
     *  ****
     */
    public static void main(String[] args) {
        int m=4;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
