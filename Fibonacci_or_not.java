import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1,c,cnt=0;
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                cnt++;
                System.out.print("True");
            }
            a=b;
            b=c;
            c=a+b;
        }
        if(cnt==0)
        System.out.print("False");
    }
}