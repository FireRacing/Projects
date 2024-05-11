package javaapplication70;
import java.util.Scanner;
abstract class square{
    Scanner in = new Scanner(System.in);
    long side;
}
class squexecute extends square
{
    void area()
    {
        System.out.println("Enter the length of the side of the square");
        side=in.nextLong();
        long area=side*side;
        System.out.println("The area of the square is: "+area);
    }
}
abstract class triangle{
    Scanner in1 = new Scanner(System.in);
    long base,height;
}
class triexecute extends triangle{
    void area()
    {
        System.out.println("Input the base length and height of the triangle");
        base=in1.nextLong();
        height=in1.nextLong();
        long area=(base*height)/2;
        System.out.println("The area of the triangle is: "+area);
    }
}

public class metrics {
    public static void main(String args[])
    {
      squexecute s = new squexecute();
      s.area();
      triexecute t = new triexecute();
      t.area();
    }
}
