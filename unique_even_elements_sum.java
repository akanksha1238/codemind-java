import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
       for(int j=0;j<n;j++)
       {
           if(arr[j]%2==0)
           {
               if(j>0)
               {
                   if(arr[j-1]!=arr[j])
                   {
                       sum=sum+arr[j];
                   }
               }
               else
               sum=sum+arr[j];
           }
       }
       System.out.println(sum);
    }
}