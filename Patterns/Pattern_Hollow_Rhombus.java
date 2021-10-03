public class Pattern_Hollow_Rhombus {
    /**
     * Print the Pattern 
     *          *****
     *         *   *
     *        *   *
     *       *   *
     *      *****
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = m; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < m; j++) {
                if (j==0 || j==(m-1) || i==1 || i==m)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
