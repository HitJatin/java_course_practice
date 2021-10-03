public class Pattern_Solid_Rectangle {
    /**
     * Print the Pattern 
     *  *****
     *  *****
     *  *****
     *  *****
     */
    public static void main(String[] args) {
        int m=4,n=5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
