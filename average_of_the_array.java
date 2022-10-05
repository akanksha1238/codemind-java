import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,s=0;
        double avg=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            s+=arr[j];
        }
        avg=(double)s/(double)n;
        System.out.println(String.format("%.2f",avg));
    }
}