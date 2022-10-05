import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem=0,c1=0,c2=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                c1++;
            }
            else
            {
                c2++;
            }
            n=n/10;
            c++;
        }
        if(c1==c)
        {
          System.out.print("Even");  
        }
        else if(c2==c)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}