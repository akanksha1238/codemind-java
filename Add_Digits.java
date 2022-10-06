import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            s+=rem;
            n=n/10;
            if(n==0&&s>9)
            {
                n=s;
                s=0;
            }
        }
        System.out.print(s);
    }
}