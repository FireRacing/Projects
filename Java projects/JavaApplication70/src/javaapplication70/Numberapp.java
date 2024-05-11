package javaapplication70;
import java.util.Scanner;

class Number{
    double number;
   Scanner in = new Scanner(System.in);
    void getvalue()
    {
        number=in.nextDouble();
        System.out.println("The inputted number is :"+number);
    }
    public boolean isZero()
    {
        if(number==0)
        {
            System.out.println("The inputted number is zero");
            return true;
        }
        return false;
    }
    public boolean isPostive()
    {
        if(number>0)
        {
            System.out.println("The inputted number is a positive number");
            return true;
        }
        return false;
    }
    public boolean isNegative()
    {
        if(number<0)
        {
            System.out.println("The inputted number is a negative  number");
            return true;
        }
        return false;
    }
    public  boolean isPrime()
    {
        double i;
       for(i=0;i<number;i++)
       {
           if(number%i==0)
           {
               System.out.println("The inputted number is a prime number");
               return true;
           }
       }
       return false;
    }
    public boolean isArmstrong()
    {
        double a,arms=0;
        double temp=number;
        while(number>0)
        {
            a=number%10;  
            number=number/10;  
            arms=arms+(a*a*a);
        }
        if(temp==arms)
        {
            System.out.println("The inputted number is an armstrong number");
            return true;
        }
        return false;
    }
}
public class Numberapp {
    public static void main (String args[])
    {
        System.out.println("Input the varible's value");
        Number n = new Number();
        n.getvalue();
        n.isPostive();
        n.isNegative();
        n.isPrime();
        n.isZero();
        n.isArmstrong();
    }
}
