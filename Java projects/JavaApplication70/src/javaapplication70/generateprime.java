package javaapplication70;
import java.util.Scanner;
import java.util.ArrayList;

public class generateprime {
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       int num,num1,i,j,flag=1;
       System.out.println("Input start limit");
       num = in.nextInt();
       System.out.println("Input end limit");
       num1 = in.nextInt();
       if(num==1&&num1==1)
       {
           System.out.println("The prime number in this range is: 1");
       }
       else
       {
    	   ArrayList<Integer> prime_list = new ArrayList<Integer>();
    	   int count=0;
    	   for(i=num;i<num1+1;i++)
    	   {
    		   for(j=1;j<num1+1;i++)
    		   {
    			   if(i%j == 0)
    				   count++;
    		   }
    		   if(count > 2)
    			   prime_list.add(i);
    	   }
    	   System.out.println("The numbers in the range "+num+" to "+num1+" are:");
    	   for(i=0;i<prime_list.size();i++)
    		   System.out.println(prime_list.get(i));
    	   prime_list.clear();
       }
       System.out.println("The prime numbers in the given range are: ");
       in.close();
   }
}
