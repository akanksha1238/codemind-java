import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,t,rem,rev=0,rem1,rev1=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0||n==1||n==2||n==3)
        System.out.print("True");
        else if(n%10==0)
        System.out.print("False");
        else
        {
            t=n*n;
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            while(t>0)
            {
                rem1=t%10;
                rev1=rev1*10+rem1;
                t=t/10;
            }
            r=rev*rev;
            if(r==rev1)
            System.out.print("True");
            else
            System.out.print("False");
        }
    }
}