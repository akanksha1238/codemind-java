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
        for(int j=0;j<n;j++)
        {
            if(arr[j]%2==1)
            {
                for(int k=n-1;k>0;k--)
                {
                    if(arr[k]%2==1)
                    {
                        for(int l=j+1;l<k;l++)
                        {
                            if(arr[l]%2==0)
                            {
                                s=1;
                                c++;
                            }
                        }
                        if(s==1)
                        break;
                    }
                }
            }
            if(s==1)
            break;
        }
        System.out.print(c);
    }
}