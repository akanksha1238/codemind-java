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
        int b[]=new int[n];
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=a[i]*a[i];
          
        }
        Arrays.sort(b);
        for(int j=0;j<n;j++)
        {
            //a[j]=sc.nextInt();
            System.out.print(b[j]+" ");
        }
        
    }
}