import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,k,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           if(a[i]%k!=0)
           {
               l++;
           }
       }
      
           System.out.print(l);
    }
}