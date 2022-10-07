import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        long n,d=0,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            d++;
            n=n/10;
        }
        long r=rev;
        long m=r%10;
        if(m!=0&&d==10)
        System.out.print("Valid");
        else
        System.out.print("Invalid");
    }
}