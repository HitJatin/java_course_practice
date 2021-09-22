public class Pattern_01_Triangle {
    /**
     * Print the Pattern 
     *  1
     *  01
     *  101
     *  0101
     *  10101
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
