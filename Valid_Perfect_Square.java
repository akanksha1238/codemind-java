import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n,c=0;
            n=sc.nextInt();
            if(n==0||n==1)
            System.out.println("True");
            else
            {
                for(int j=1;j*j<=n;j++)
                {
                    if(n%j==0&&n/j==j)
                    {
                        c=1;
                        System.out.println("True");
                        break;
                    }
                }
                if(c==0)
                System.out.println("False");
            }
        }
    }
}