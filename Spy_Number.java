import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,s=0,p=1,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            s+=rem;
            p*=rem;
            n=n/10;
        }
        if(s==p)
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
}