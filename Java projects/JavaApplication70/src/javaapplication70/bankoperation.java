package javaapplication70;
import java.util.Scanner;
import java.lang.StringBuffer;
class Account{
    Scanner in1 = new Scanner(System.in);
    StringBuffer name = new StringBuffer();
    StringBuffer accnum = new StringBuffer();
    StringBuffer acctype = new StringBuffer();
    long minbal;
    long presentbal;
    long presentbal1;
}
class savings extends Account{
    void init()
    {
        System.out.println("Input present balance");
        presentbal = in1.nextLong();
    }
    void inputdetails()
    {
        System.out.println("Input your details");
        name = name.append(in1.nextLine());
        accnum = accnum.append(in1.nextLine());
        acctype = acctype.append(in1.nextLine());
    }
    void run()
    {
        long deposit,withdraw;
        System.out.println("Input the minimum balance to be maintained in the account");
        minbal = in1.nextLong();
        boolean run = true;
        int choice;
        while(run)
        {
            System.out.println("-----------------------------");
            System.out.println("Welcome to the Bank's ATM");
            System.out.println("-----------------------------");
            System.out.println("Available Operations:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Exit");
            System.out.println("Input your choice");
            choice = in1.nextInt();
            if(choice==1)
            {
                System.out.println("Input the amount you wish to deposit");
                deposit = in1.nextLong();
                presentbal = presentbal+deposit;
            }
            else if(choice==2)
            {
                System.out.println("Input the amount you wish to withdraw");
                withdraw = in1.nextLong();
                if(presentbal<withdraw)
                    System.out.println("You do not enough money to facilate this transaction");
                else
                    presentbal = presentbal - withdraw;
            }
            else if(choice==3)
            {
                break;
            }
            char choice1;
            System.out.println("Transaction completed.");
            System.out.println("Do you wish to perform another transcation?");
            choice1 = in1.next().charAt(0);
            if(choice1=='Y')
            {
                
            }
            else if(choice1=='N')
                return;
        }
    }
}
class current extends Account{
    void init()
    {
        System.out.println("Input present balance");
        presentbal1 = in1.nextLong();
    }
    void inputdetails()
    {
        System.out.println("Input your details");
        name = name.append(in1.nextLine());
        accnum = accnum.append(in1.nextLine());
        acctype = acctype.append(in1.nextLine());
    }
    void run()
    {
        double tax = 1.5;
        long deposit,withdraw;
        System.out.println("Input the minimum balance to be maintained in the account");
        minbal = in1.nextLong();
        boolean run = true;
        int choice;
        while(run)
        {
            System.out.println("-----------------------------");
            System.out.println("Welcome to the Bank's ATM");
            System.out.println("-----------------------------");
            System.out.println("Available Operations:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Exit");
            System.out.println("Input your choice");
            choice = in1.nextInt();
            if(choice==1)
            {
                System.out.println("Input the amount you wish to deposit");
                deposit = in1.nextLong();
                presentbal1 = presentbal1+deposit;
            }
            else if(choice==2)
            {
                System.out.println("Input the amount you wish to withdraw");
                withdraw = in1.nextLong();
                if(presentbal1<withdraw)
                    System.out.println("You do not enough money to facilitate this transaction");
                else if(presentbal1<minbal)
                {
                    System.out.println("You have been taxed for not maintaining the required amount in your account");
                    long servicetax;
                    servicetax = (long) ((long)presentbal1*tax);
                    presentbal1 = presentbal1 - servicetax;
                }
                else
                    presentbal1 = presentbal1 - withdraw;
            }
            else if(choice==3)
            {
                break;
            }
            char choice1;
            System.out.println("Transaction completed.");
            System.out.println("Do you wish to perform another transcation?");
            choice1 = in1.next().charAt(0);
            if(choice1=='Y')
            {
                
            }
            else if(choice1=='N')
                return;
        }
    }
}

public class bankoperation {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String acctype1;
        System.out.println("Input your account type");
        acctype1 = in.nextLine();
        if("savings".equals(acctype1))
        {
            savings s = new savings();
            s.init();
            s.inputdetails();
            s.run();
        }
        else if("current".equals(acctype1))
        {
            current c = new current();
            c.init();
            c.inputdetails();
            c.run();
        }
        in.close();
    }
}