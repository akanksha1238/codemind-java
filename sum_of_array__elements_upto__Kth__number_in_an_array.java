import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if (arr[j]!=k)
            {
                sum=sum+arr[j];
            }
            else
            {
                sum=sum+arr[j];
                break;
            }
        }
        System.out.println(sum);
    }
}