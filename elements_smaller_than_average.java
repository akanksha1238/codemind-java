import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,avg,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=(int)sum/n;
        for(int j=0;j<n;j++)
        {
            if(arr[j]<=avg)
            c++;
        }
        System.out.println(c);
    }
}