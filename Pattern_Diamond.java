public class Pattern_Diamond {
    /**
     * Print the Pattern 
     *       *
     *      ***
     *     *****
     *    *******
     *    *******
     *     *****
     *      ***
     *       *
     */
    public static void main(String[] args) {
        int m=4;
        for (int i = 1; i <= m; i++) {
            for (int j=m;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = m; i >= 1; i--) {
            for (int j=m;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
