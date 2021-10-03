public class Pattern_Floyd_Triangle {
    /**
     * Print the Pattern 
     *  1
     *  2 3
     *  4 5 6
     *  7 8 9 10
     *  11 12 13 14 15
     */
    public static void main(String[] args) {
        int m=5,number=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
