public class Pattern_Pascal_Triangle {
    /**
     * Print the Pattern 
     *       1
     *      1 1
     *     1 2 1
     *    1 3 3 1
     *   1 4 6 4 1
     */
    public static void main(String[] args) {
        int m=5;
        for (int i = 0; i < m; i++) {
            for (int j = m; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int pascalNumber=factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(pascalNumber+" ");
            }
            System.out.println();
        }
    }
    public static int factorial(int num){
        if(num==0 || num==1)
        return 1;
        return num*factorial(num-1);
    }
}
