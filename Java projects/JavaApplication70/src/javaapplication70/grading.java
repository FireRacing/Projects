package javaapplication70;
import java.util.Scanner;

public class grading {
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int Subject1,Subject2,Subject3;
        try
        {
            System.out.println("Enter the student's scores in the three subjects");
            Subject1=in.nextInt();
            Subject2=in.nextInt();
            Subject3=in.nextInt();
            float total = Subject1+Subject2+Subject3;
            float percent = (total/300)*100;
            System.out.println("The student's percentage is: "+percent);
            if(percent>90)
                System.out.println("The student has scored an overall A+");
            else if(percent>=80&&percent<=90)
                System.out.println("The student has scored an overall A");
            else if(percent>=70&&percent<=80)
                System.out.println("The student has scored an overall B");
            else if(percent>=60&&percent<=70)
                System.out.println("The student has scored an overall C");
            else if(percent>=50&&percent<=60)
                System.out.println("The student has scored an overall D");
            else if(percent>45)
                System.out.println("The student has scored an overall E");
            else 
                System.out.println("The student has failed");
            in.close();
        }catch(NumberFormatException e){
            System.out.println("caught: "+e);
        }
    }
}
