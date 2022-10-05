import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int p,t,r;
        int si;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.print(si);
    }
}