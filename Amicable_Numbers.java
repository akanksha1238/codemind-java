import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int a,b,s1=0,s2=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s1+=i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                s2+=i;
            }
        }
        if(s1==b&&s2==a)
        System.out.print("Amicable");
        else
        System.out.print("Not Amicable");
    }
}