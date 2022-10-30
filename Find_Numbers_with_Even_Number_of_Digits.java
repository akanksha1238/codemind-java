import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,d=0,e=0;
        int x,y=0,z;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            d=0;
             while(a[i]!=0)
            {
                y=a[i]%10;
                d++;
                a[i]=a[i]/10;
            }
            if(d%2==0)
            {
            c++;
            
            }
          
        }
        System.out.println(c);
    }
}