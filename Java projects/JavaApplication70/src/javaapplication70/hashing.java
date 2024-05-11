package javaapplication70;

class hash{
    int[] return_hashed_array(int arr[],int ele)
    {
        int n = arr.length;
        int t = ele%n;
        int i,t1;
        if(arr[t]>0)
        {
            for(i=1;i<n;i++)
            {
                t1 = (t+i)%n;
                if(arr[t1]>0)
                    continue;
                else
                {
                    arr[t1] = ele;
                    break;
                }
            }
        }
        else
            arr[t] = ele;
        return arr;
    }
}

public class hashing {
    public static void main(String args[])
    {
        int arr[] = new int[100];
        hash h = new hash();
        arr = h.return_hashed_array(arr, 1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        arr = h.return_hashed_array(arr, 500);
        System.out.println(" ");
    
    }
}