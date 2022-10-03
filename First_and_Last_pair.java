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
       for(int j=0,k=n-1;;j++,k--)
       {
           if(j!=k && j<k)
           {
               System.out.print(arr[j]+" ");
               System.out.print(arr[k]+" ");
           }
           else if(j==k)
           {
               System.out.print(arr[j]+" "+"0");
           }
           if(k<j)
           break;
       }
    }
}