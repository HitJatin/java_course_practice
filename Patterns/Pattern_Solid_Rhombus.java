public class Pattern_Solid_Rhombus {
    /**
     * Print the Pattern 
     *          *****
     *         *****
     *        *****
     *       *****
     *      *****
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = m; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
