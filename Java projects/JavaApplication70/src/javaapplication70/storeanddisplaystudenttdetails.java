package javaapplication70;
import java.util.Scanner;
class Student_Detail{
    Scanner in1 = new Scanner(System.in);
    StringBuffer name = new StringBuffer();
    StringBuffer id = new StringBuffer();
    StringBuffer college_name = new StringBuffer();
    String storage [] = new String [100];
    void getdetails()
    {
        System.out.println("Input the student's details");
        name = name.append(in1.nextLine());
        id = id.append(in1.nextLine());
        college_name = college_name.append(in1.nextLine());
        String id1 = id.toString();
        String n = name.toString();
        String c_n = college_name.toString();
        storage[0] = n;
        storage[1] = id1;
        storage[2] = c_n;
    }
    void display_details()
    {
        System.out.println("Output:-");
        for (int i=0;i<3;i++)
        {
            if("MIT".equals(storage[i]))
            {
                for(int j=0;j<3;j++)
                {
                    System.out.println(storage[j]);
                }
            }
        }
    }
}
public class storeanddisplaystudenttdetails {
    public static void main(String args[])
    {
        Student_Detail sd = new Student_Detail();
        sd.getdetails();
        sd.display_details();
        sd.in1.close();
    }
}