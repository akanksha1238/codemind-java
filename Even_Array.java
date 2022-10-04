import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,avg,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            c++;
        }
        if(c==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}