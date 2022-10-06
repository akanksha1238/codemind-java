import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,p,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            p=1;
            for(int i=1;i<=rem;i++)
            {
                p=p*i;
            }
            s+=p;
            n=n/10;
        }
        if(s==temp)
        System.out.print("The number "+temp+" is a strong number");
        else
        System.out.print("The number "+temp+" is not a strong number");
    }
}