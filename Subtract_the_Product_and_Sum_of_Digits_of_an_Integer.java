import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,s=0,p=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            s+=rem;
            p*=rem;
            n=n/10;
        }
        System.out.print(p-s);
    }
}