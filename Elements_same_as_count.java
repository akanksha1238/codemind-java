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
        int p=0,q=0,r=0;
        int a[]=new int[p];
        int b[]=new int[q];
        int e[]=new int[r];
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
                {
                    if(arr[j]==arr[l])
                    {
                        count++;
                    }
                }
                a=add(p,a,arr[j]);
                b=add(q,b,count);
                p++;
                q++;
            }
        }
        for(int m=0,w=0;m<p&&w<q;m++,w++)
        {
            if(a[m]==b[w])
            {
                e=add(r,e,a[m]);
                r++;
            }
        }
       if(r==0)
       System.out.println("-1");
       else
       {
          for(int d=0;d<r;d++)
          {
              System.out.print(e[d]+" ");
          }
       }
    }
}