package Patterns;

public class Pattern_Palindrome_Pyramid {
    /**
     * Print the Pattern 
     *          1
     *         212
     *        32123
     *       4321234
     *      543212345
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < (m-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
