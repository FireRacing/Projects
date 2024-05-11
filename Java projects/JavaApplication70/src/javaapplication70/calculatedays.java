package javaapplication70;
class Date{
    int day,month,year;
    Date(int day1,int month1,int year1)
    {
        day = day1;
        month = month1;
        year = year1;
    }
    int calculateNoofDays(Date d,Date d1)
    {
        int yeardiff;
        int year1 = d.year;
        int year2 = d1.year;
        if(year1>year2)
            yeardiff = year1-year2;
        else
            yeardiff = year1-year2;
        int yearsum =0;
        for(int i=0;i<=yeardiff;i++)
        {
            if(i%4==0)
                yearsum = yearsum+366;
            else
                yearsum = yearsum+365;
        }
        int monthsum1=0,monthsum2=0;
        for(int i=1;i<d.month;i++)
        {
            if(i%2==0)
            {
                if(i==2)
                {
                    if(d.year%4==0)
                        monthsum1 = monthsum1+29;
                    else
                        monthsum1 = monthsum1+28;
                }
                monthsum1 = monthsum1+30;
            }
            else if(i%2==1)
            {
                monthsum1 = monthsum1+31;
            }
        }
        monthsum1 = monthsum1-d.day;
        for(int i=1;i<d1.month;i++)
        {
            if(i%2==0)
            {
                if(i==2)
                {
                    if(d.year%4==0)
                        monthsum2 = monthsum2+29;
                    else
                        monthsum2 = monthsum2+28;
                }
                monthsum2 = monthsum2+30;
            }
            else if(i%2==1)
            {
                monthsum2 = monthsum2+31;
            }
        }
        monthsum2 = monthsum2-d1.day;
        yearsum = yearsum-monthsum1-monthsum2;
        return yearsum;
    }
}

public class calculatedays {
    public static void main(String args[])
    {
        Date d = new Date(1,12,1890);
        Date d1 = new Date(13,4,2010);
        Date d2 = new Date(0,0,0);
        System.out.println("No. of days: "+d2.calculateNoofDays(d, d1));
    }
}
