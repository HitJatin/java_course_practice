import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("\nReverse a String\n");
        System.out.print("Please enter a string:");

        Scanner sc =new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length()/2;i++){
            char front=str.charAt(i);
            str.setCharAt(i, str.charAt(str.length()-i-1));
            str.setCharAt(str.length()-i-1, front);
        }
        System.out.println(str);
        sc.close();
    }
}
