import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            if(n<0){
                n=n*(-1);
            }
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp<0)
        System.out.print(rev*(-1));
        else
        System.out.print(rev);
    }
}