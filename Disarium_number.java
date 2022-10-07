import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,d=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n,m=n;
        while(n>0)
        {
            d++;
            n=n/10;
        }
        while(temp>0)
        {
            rem= temp % 10;  
            sum = sum + (int)Math.pow(rem,d);
            d--;
            temp = temp / 10;
        }
        if(sum==m)
        System.out.print("True");
        else
        System.out.print("False");
    }
}