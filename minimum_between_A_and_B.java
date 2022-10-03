import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,a,b,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int max=-1;
        for(int j=0;j<n;j++)
        {
            if(arr[j]>=a && arr[j]<=b)
            {
               if(arr[j]>max)
               max=arr[j];
            }
        }
        int min=max;
        for(int k=0;k<n;k++)
        {
            if(arr[k]>=a && arr[k]<=b)
            {
                if(arr[k]<min)
                min=arr[k];
            }
        }
        System.out.print(min);
    }
}