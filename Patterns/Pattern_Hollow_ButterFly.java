public class Pattern_Hollow_ButterFly {
    /**
     * Print the Pattern 
     *      *        *
     *      **      **
     *      * *    * *
     *      *  *  *  *
     *      *   **   *
     *      *   **   *
     *      *  *  *  *
     *      * *    * *
     *      **      **
     *      *        *
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for (int j=m;j>i;j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for (int j=m;j>i;j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
