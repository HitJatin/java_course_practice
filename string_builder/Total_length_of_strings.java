package string_builder;

import java.util.Scanner;

public class Total_length_of_strings {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int total_strings,total_length=0;
        StringBuilder[] strings;

        System.out.println("\nTotal Length of Strings\n");
        System.out.print("Enter total no of strings:");
        
        total_strings=inp.nextInt();
        consumeEnterAfterInt(inp);
        
        System.out.println("Enter the strings one by one by pressing enter key");
        
        strings=new StringBuilder[total_strings];
        
        for (int i = 0; i < total_strings; i++) {
            strings[i]=new StringBuilder(inp.nextLine());
            total_length+=strings[i].length();
        }

        System.out.println("Total length of all strings is: "+total_length);
        
        inp.close();
    }

    private static void consumeEnterAfterInt(Scanner inp){
        inp.nextLine();
    }
}