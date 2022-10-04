import java.util.*;
class Sample
{
    public static int[] add(int h,int a[],int x)
    {
        int newarr[]=new int[h+1];
        for(int g=0;g<h;g++)
        {
            newarr[g]=a[g];
        }
        newarr[h]=x;
        return newarr;
    }
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
        int p=0;
        int a[]=new int[p];
        for(int j=0;j<n;j++)
        {
            int c=0,count=1;
            for(int k=0;k<p;k++)
            {
                if(a[k]==arr[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                for(int l=j+1;l<n;l++)
                if(arr[j]==arr[l])
                {
                    count++;
                }
            a=add(p,a,arr[j]);
            p++;
            System.out.print(arr[j]+" "+count+" ");
            }
        }
        
    }
}