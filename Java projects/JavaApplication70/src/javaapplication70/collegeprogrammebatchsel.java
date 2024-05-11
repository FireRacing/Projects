package javaapplication70;
import java.util.Scanner;
class student{
    Scanner in1 = new Scanner(System.in);
    long regno;
    StringBuffer name = new StringBuffer();
    StringBuffer age = new StringBuffer();
}
class UG extends student
{
    int semester;
    long fees;
    void getdetails()
    {
        System.out.println("Enter the studednt's name");
        name = name.append(in1.nextLine());
    }
}
class PG extends student
{
    int semester;
    long fees;
    void getdetails()
    {
        System.out.println("Enter the studednt's name");
        name = name.append(in1.nextLine());
    }
}

public class collegeprogrammebatchsel {
    public static void main(String args[])
    {
        UG u = new UG();
        u.getdetails();
    }
}
