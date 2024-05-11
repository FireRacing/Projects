package javaapplication70;
import java.util.Scanner;
import java.io.*;
import java.lang.StringBuffer;
class Book{
    StringBuffer title = new StringBuffer();
    StringBuffer author = new StringBuffer();
    StringBuffer edition = new StringBuffer();
    Scanner in = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter the book's details");
        title.append(in.nextLine());
        author.append(in.nextLine());
        edition=edition.append(in.nextLine());
    }
    void writetofile()
    {
        String t = title.toString();
        String a = author.toString();
        String e = edition.toString();
        try{
           PrintWriter writer = new PrintWriter("booklist.txt");
           writer.println(t);
           writer.println(a);
           writer.println(e);
           writer.close();
        }catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    void readfromfile()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("booklist.txt"));
            if(reader.ready()==true)
            {
                reader.readLine();
            }
            reader.close();
        }catch(IOException ex)
        {
            System.out.println("ex");
        }
    }
}

public class Bookapp {
    public static void main(String args[])
    {
        Book b1 = new Book();
        b1.getdata();
        b1.writetofile();
    }
}