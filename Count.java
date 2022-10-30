import java.util.*;
class Main
{
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        //m=sc.nextInt();
        int e=0,o=0;
        
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            
               a[i]=sc.nextInt();
              if(a[i]%2==0)
              {
                  e++;
              }
              else
              {
                  o++;
              }
            
            
        }
        System.out.print(e+" "+o);
    }
        
}