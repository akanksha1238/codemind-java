import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,t,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n*n;
        while(n>0)
        {
            if(n%10!=t%10)
            {
                c=1;
                System.out.print("Not an Automorphic Number");
                break;
            }
            n=n/10;
            t=t/10;
        }
        if(c==0)
        System.out.print("Automorphic Number");
    }
}