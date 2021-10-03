public class Pattern_Inverted_Half_Pyramid_Numbers {
    /**
     * Print the Pattern 
     *  12345
     *  1234
     *  123
     *  12
     *  1
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = m; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
