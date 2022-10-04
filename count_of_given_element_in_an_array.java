import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,c=0,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(arr[j]==a)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}