import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n/2;i++)
        {
            if(i*(i+1)==n)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}