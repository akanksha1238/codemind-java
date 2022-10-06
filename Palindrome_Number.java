import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,rem,rev=0;
            n=sc.nextInt();
            int temp=n;
            if(n<0)
            System.out.println("False");
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(rev==temp)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}