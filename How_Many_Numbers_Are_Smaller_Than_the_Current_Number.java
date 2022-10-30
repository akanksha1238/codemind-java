import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,k,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
          
       }
       for(int i=0;i<n;i++)
       {
           l=0;
            for(int j=0;j<n;j++)
           {
               if(a[j]<a[i])
               {
               l++;   
               }
           } System.out.print(l+" ");
           
           
       }
    }
}