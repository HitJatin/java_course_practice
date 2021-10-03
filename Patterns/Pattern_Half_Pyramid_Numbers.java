package Patterns;

public class Pattern_Half_Pyramid_Numbers {
    /**
     * Print the Pattern 
     *  1
     *  12
     *  123
     *  1234
     *  12345
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
