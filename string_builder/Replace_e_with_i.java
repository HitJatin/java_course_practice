package string_builder;

import java.util.Scanner;
    
public class Replace_e_with_i {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        StringBuilder str;

        System.out.println("\nReplace e with i\n");
        System.out.print("Enter original string:");
        str=new StringBuilder(inp.nextLine());
        inp.close();

        for (int i = 0; i < str.length(); i++) {
            if(check_e(i,str))
            str.setCharAt(i,'i');
        }

        System.out.println("Updated String is :"+str);
    }

    private static boolean check_e(int i, StringBuilder str){
        if(str.charAt(i)=='e')
        return true;
        else
        return false;
    }
}