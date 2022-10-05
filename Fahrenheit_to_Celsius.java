import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int f;
        double c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextInt();
        c=(f-32)/1.8;
        System.out.print(String.format("%.2f",c));
    }
}