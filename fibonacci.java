import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}