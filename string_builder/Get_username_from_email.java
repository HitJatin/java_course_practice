package string_builder;

import java.util.Scanner;

public class Get_username_from_email {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        StringBuilder email,username;
        int username_end_index;
        System.out.println("\nGet Username from Email\n");
        System.out.print("Enter your email:");
        email=new StringBuilder(inp.next());
        inp.close();

        for(username_end_index=0; username_end_index<email.length(); username_end_index++){
            if(check_at_the_rate(username_end_index,email))
            break;
        }

        username=new StringBuilder(email.substring(0,username_end_index));
        System.out.println("Your username is :"+username);
    }

    private static boolean check_at_the_rate(int i,StringBuilder email){
        if(email.charAt(i)=='@')
        return true;
        else
        return false;
    }
}
