import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        System.out.print("False");
        else
        System.out.print("True");
    }
}