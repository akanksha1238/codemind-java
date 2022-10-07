import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        System.out.print("True");
        else
        System.out.print("False");
    }
}