import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        double p,r,t;
        double a;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        a=p*(Math.pow(1+(r/100),t));
        System.out.println(String.format("%.2f",a));
    }
}