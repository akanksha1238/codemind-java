import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int l,r,k,c=0;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}