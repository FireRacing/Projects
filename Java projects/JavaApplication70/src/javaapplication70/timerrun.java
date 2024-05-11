package javaapplication70;
import java.util.Scanner;
class Invalid_time extends Exception
{
    Invalid_time()
    {
        System.out.println("Inputted time is invalid");
    }
}
class time{
    int hh;
    int mm;
    int ss;
    Scanner in1 = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Input the time");
        hh=in1.nextInt();
        mm=in1.nextInt();
        ss=in1.nextInt();
    }
    void calculate()
    {
        while(hh>24)
        {
            hh = hh-24;
        }
        while(mm>60)
        {
            mm = mm-60;
        }
        while(ss>60)
        {
            ss = ss-60;
        }
        if(hh==24)
        {
            hh=0;
        }
        if(mm==60)
        {
            mm=0;
            hh = hh+1;
        }
        if(ss==60)
        {
            ss = 0;
            mm = mm+1;
        }
    }
    void display()
    {
        System.out.println("The inpuuted time is : "+hh+":"+mm+":"+ss);
    }
    void timer(int hh1,int mm1,int ss1) throws Invalid_time
    {
        if(hh>hh1)
        {
            throw new Invalid_time();
        }
        while(true)
        {
            if(hh==hh1&&mm==mm1&&ss==ss1)
            {
                System.out.println("Alert!");
                System.exit(0);
            }
            else
            {
                ss++;
                if(ss==60)
                {
                    ss=0;
                    mm++;
                }
                if(mm==60)
                {
                    hh++;
                    mm=0;
                }
            }
        }
    }
}

public class timerrun {
    public static void main(String args[])
    {
        time t = new time();
        try{
            t.timer(0,0,0);
        }catch(Exception e)
        {
            
        }
    }
}