import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,t,rem,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n*n;
        while(t>0)
        {
            rem=t%10;
            s+=rem;
            t=t/10;
        }
        if(s==n)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}