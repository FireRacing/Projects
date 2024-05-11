package javaapplication70;
import java.util.Scanner;
public class numbs {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the loop's limit");
        n=in.nextInt();
        for(i=0;i<=n;i++)
        {
           System.out.println(+i);
           System.out.println("\n");
           System.out.println("\t");
        }
        in.close();
    }
}
