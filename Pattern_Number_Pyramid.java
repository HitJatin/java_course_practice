public class Pattern_Number_Pyramid {
    /**
     * Print the Pattern 
     *          1
     *         2 2
     *        3 3 3
     *       4 4 4 4
     *      5 5 5 5 5
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < (m-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
