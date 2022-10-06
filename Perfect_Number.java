import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}