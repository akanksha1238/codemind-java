import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int max=0;
        while(n>0)
        {
            rem=n%10;
            if(max<rem)
            {
                max=rem;
            }
            n=n/10;
        }
        System.out.print(max);
    }
}