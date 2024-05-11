package javaapplication70;
import java.util.Scanner;
import java.io.*;

public class iooperations {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Welcome");
        System.out.println("----------------------");
        System.out.println("Available Operations:");
        System.out.println("1.Write to a file");
        System.out.println("2.Read from a file");
        System.out.println("3.Copy bytes from one file to another");
        System.out.println("Input your choice");
        int choice;
        choice = in.nextInt();
        in.nextLine();
        if(choice==1)
        {
            System.out.println("Input a string");
            String s;
            s = in.nextLine();
            try
            {
                PrintWriter writer = new PrintWriter("io.txt");
                writer.write(s);
                writer.close();
            }catch(IOException ex)
            {System.out.println(ex);}
        }
        if(choice==2)
        {
            try{
            BufferedReader reader = new BufferedReader(new FileReader(("io.txt")));
            reader.readLine();
            System.out.println("Read form file");
            reader.close();
            }catch(IOException ex)
            {System.out.println(ex);}
        }
        if (choice==3)
        {
            String s;
            byte b[];
            try{
                BufferedReader reader = new BufferedReader(new FileReader("io.txt"));
                PrintWriter writer = new PrintWriter("io1.txt");
                if((reader.ready())==true)
                {
                    s = reader.readLine();
                    reader.close();
                    b = s.getBytes();
                    int len = b.length;
                    for(int i=0;i<len;i++)
                    {
                        writer.print(b[i]);
                        writer.print(" ");
                    }
                    writer.close();
                }
                reader.close();
            }catch(IOException e)
            {System.out.println(e);}
        }
        in.close();
    }
}