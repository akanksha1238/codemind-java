import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int b,p=1;
            b=sc.nextInt();
            for(int j=b;j>=1;j--)
            {
                p=p*j;
            }
            System.out.println(p);
        }
    }
}