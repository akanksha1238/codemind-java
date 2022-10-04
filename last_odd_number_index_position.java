import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,avg,s=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--)
        {
            if(arr[j]%2==1)
            {
                System.out.print(j);
                break;
            }
        }
    }
}