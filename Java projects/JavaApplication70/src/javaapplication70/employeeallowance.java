package javaapplication70;
import java.util.Scanner;
import java.lang.String;
class employee
{
    String name;
    String city;
    long basic;//basic salary
    long da;//dearness allowance
    double rent;
    double total;
    Scanner in = new Scanner(System.in);
    void getdata()
    {
        name=in.nextLine();
        city=in.nextLine();
        basic=in.nextLong();
        da=in.nextLong();
        rent=in.nextDouble();
    }
    double calculate()
    {
        total=basic+basic*da/100+basic*rent/100;
        return total;
    }
    void disp()
    {
        System.out.println("name: "+name);
        System.out.println("residing in: "+city);
        System.out.println("base salary is: "+basic);
        System.out.println("dearness allowance is: "+da);
        System.out.println("employee's house rent is: "+rent);
        System.out.println("The total including base salary ,DA and house rent is: "+total);
    }
}

public class employeeallowance {
    public static void main(String args[])
    {
        employee e1 = new employee();
        System.out.println("Insert the elements");
        e1.getdata();
        e1.calculate();
        e1.disp();
    }
}