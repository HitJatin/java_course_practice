public class Pattern_Number_Pyramid_Type2 {
    /**
     * Print the Pattern 
     *          1
     *         1 2
     *        1 2 3
     *       1 2 3 4
     *      1 2 3 4 5
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < (m-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
