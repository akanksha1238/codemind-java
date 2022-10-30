import java.io.*;
import java.util.*;
class Sample
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String input;
        input=br.readLine();
        String s[]=input.split(":");
        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        float c=(float)(0.5)*((60*h)+m);
        float v=(float)(6*m);
        float b=Math.abs(c-v);
        float n=Math.min(360-b,b);
        System.out.format("%.1f",n);
    }
}