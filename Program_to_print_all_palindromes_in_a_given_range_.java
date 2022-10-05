import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int j=i;
            int rem=0,rev=0;
            while(j!=0)
            {
                rem=j%10;
                rev=rev*10+rem;
                j=j/10;
            }
            if(rev==i)
            {
                System.out.print(rev+" ");
            }
        }
    }
}