import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                c=1;
                break;
            }
        }
        if(c==0&&n!=0&&n!=1)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}