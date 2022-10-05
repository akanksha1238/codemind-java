import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=0;j<n;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        System.out.println(max);
    }
}