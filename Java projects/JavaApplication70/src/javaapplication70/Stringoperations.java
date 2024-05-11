package javaapplication70;
import java.util.Scanner;

public class Stringoperations {
    public static void main(String args[])
    {
    	
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Input string");
        s = in.nextLine();
        while(true)
        {
            System.out.println("---------");
            System.out.println("Welcome");
            System.out.println("---------");
            System.out.println("Operations available:");
            System.out.println("1.Comparison of two strings");
            System.out.println("2.Convert uppercase characters to lowercase");
            System.out.println("3.Check whether a string is a substring of the given string or not");
            System.out.println("4.Replace a substring with 'Hello'");
            System.out.println("5.Exit");
            System.out.println("Input your choice");
            int choice;
            choice = in.nextInt();
            in.nextLine();
            if(choice==1)
            {
                String s1;
                System.out.println("Input a string to compare the given string with");
                s1 = in.nextLine();
                if(s.equalsIgnoreCase(s1))
                    System.out.println("The two strings are the same");
                else
                    System.out.println("The two strings are not the same");
            }
            else if(choice==2)
                System.out.println(s.toLowerCase());
            else if(choice==3)
            {
                System.out.println("Input a string to compare the given string with");
                String s2;
                s2 = in.nextLine();
                char c;
                char d;
                int count=0;
                boolean match = true;
                for (int i = 0; i < s.length(); i++) {
                    c = s.charAt(i);
                    for (int j = 0; j < s2.length(); j++) {
                        d = s2.charAt(j);
                        if (c == d) {
                            match = true;
                            count++;
                            if(count== s2.length()){
                                i = s.length();
                                break;
                            }
                            i++;
                            c = s.charAt(i);
                        } 
                        else
                            match = false;
                    }
                }
                if(match == true)
                    System.out.println("The inputted string is a sub string ");
            }
            else if(choice==4)
            {
                System.out.println("Input a string to compare the given string with");
                String s3;
                s3 = in.nextLine();
                char c;
                char d;
                int count=0;
                boolean match = true;
                for (int i = 0; i < s.length(); i++) {
                    c = s.charAt(i);
                    for (int j = 0; j < s3.length(); j++) {
                        d = s3.charAt(j);
                        if (c == d) {
                            match = true;
                            count++;
                            if(count== s3.length()){
                                i = s.length();
                                break;
                            }
                            i++;
                            c = s.charAt(i);
                        } 
                        else
                            match = false;
                    }
                }
                if(match == true)
                    System.out.println("The modified string is: "+s.replaceAll(s3, "Hello"));
            }
            else if(choice==5)
            {
            	in.close();
            	return;
            }
        }
    }
}
