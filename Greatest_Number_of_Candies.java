import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if((k+arr[i])>=max)
            {
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
    }
}