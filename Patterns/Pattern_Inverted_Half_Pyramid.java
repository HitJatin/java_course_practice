package Patterns;

public class Pattern_Inverted_Half_Pyramid {
    /**
     * Print the Pattern 
     *  ****
     *  ***
     *  **
     *  *
     */
    public static void main(String[] args) {
        int m=4;
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
