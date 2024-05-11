package javaapplication70;
import java.util.Scanner;
  
public class Armstrong {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int num,arms=0,a,temp;
        System.out.println("Enter the number to be verified");
        num=in.nextInt();
        temp=num;
        while(num>0)
        {
            a=num%10;  
            num=num/10;  
            arms=arms+(a*a*a);
        }
        if(temp==arms)
        {
            System.out.println("The inputted number is an armstrong number");
        }
        else
        {
            System.out.println("The inputted number is not an armstrong number");
        }
        in.close();
    }   
}