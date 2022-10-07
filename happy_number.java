import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>9)
        {
            int m=n,sum=0,rem=0;
            while(m!=0)
            {
                rem=m%10;
                sum+=rem*rem;
                m=m/10;
            }
            n=sum;
        }
        if(n==1||n==7)
        System.out.print("True");
        else
        System.out.print("False");
    }
}