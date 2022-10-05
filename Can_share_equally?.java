import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        if(x%2==0&&y%2==0)
        {
            System.out.print("YES");
        }
        else if(x%2==0&&y%2==1&&x!=0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}