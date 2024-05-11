package javaapplication70;
import java.util.Scanner;

class rect
{
    Scanner in = new Scanner(System.in);
    double length,breadth,area;
    void displayArea()
    {
        System.out.println("Enter the parameters of the rectangle");
        length=in.nextDouble();
        breadth=in.nextDouble();
        area=length*breadth;
        System.out.println("The area of the rectangle is: "+area);
    }
}
class sq
{
    double side,area1;
    Scanner in1 = new Scanner(System.in);
    void displayArea()
    {
        System.out.println("Enter the parameters of the square");
        side =in1.nextDouble();
        area1 = side*side;
        System.out.println("The area is: "+area1);
    }
}

public class rectandsq {
    public static void main(String args[])
    {
        rect r = new rect();
        r.displayArea();
        sq s = new sq();
        s.displayArea();
    }
}
