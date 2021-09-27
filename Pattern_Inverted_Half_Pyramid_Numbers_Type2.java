public class Pattern_Inverted_Half_Pyramid_Numbers_Type2 {
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
        for (int i = 1; i <= m; i++) {
            for (int j = m; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
