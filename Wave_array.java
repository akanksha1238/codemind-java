import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if (arr[0]<arr[1])
        {
            c=0;
            for(int j=0;j<n-2;j+=2)
            {
                if(arr[j]>=arr[j+1]||arr[j+1]<arr[j+2])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            System.out.println("yes");
            else
            System.out.println("no");
        }
        else
        {
            c=0;
            for(int j=0;j<n-2;j+=2)
            {
                if(arr[j]<arr[j+1]||arr[j+1]>=arr[j+2])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}