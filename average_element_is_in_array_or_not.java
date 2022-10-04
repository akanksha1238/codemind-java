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
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
        }
        avg=(int)s/n;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==avg)
            {
                System.out.print("True");
                c++;
                break;
            }
        }
        if(c==0)
        System.out.print("False");
    }
}