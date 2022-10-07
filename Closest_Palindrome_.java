import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n-1;;i--)
        {
            int rem,rev=0,m=i;
            while(m>0)
            {
                rem=m%10;
                rev=rev*10+rem;
                m=m/10;
            }
            if(rev==i)
            break;
        }
        for(j=n+1;;j++)
        {
            int rem,rev=0,m=j;
            while(m>0)
            {
                rem=m%10;
                rev=rev*10+rem;
                m=m/10;
            }
            if(rev==j)
            break;
        }
        if((j-n)<(n-i))
        System.out.print(j);
        else if((j-n)>(n-i))
        System.out.print(i);
        else
        System.out.print(i+" "+j);
    }
}