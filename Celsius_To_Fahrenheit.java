import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=c*1.8+32;
        System.out.print(String.format("%.2f",f));
    }
}