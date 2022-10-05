import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int m,n,s=0,c=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            c=0;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0&&i!=1&&i!=0)
            {
                s++;
            }
        }
        System.out.print(s);
    }
}