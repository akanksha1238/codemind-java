import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int t,s,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int c=2*t*s*b*512;
        int tc=c/1024;
        System.out.println(tc+"KB");
        
    }
}