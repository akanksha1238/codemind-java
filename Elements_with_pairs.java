import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,a,b,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       for(int j=0;;j+=2)
       {
           if(j!=n-1)
           {
               System.out.print(arr[j]+" ");
               System.out.print(arr[j+1]+" ");
           }
           else if(j==n-1)
           {
               System.out.print(arr[j]+" "+"0");
               c=1;
           }
           if(j==n||c==1)
           break;
       }
    }
}