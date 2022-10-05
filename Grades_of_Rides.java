import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int h,s,sp;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        s=sc.nextInt();
        sp=sc.nextInt();
        if(h>50&&s>60&&sp>100)
        {
            System.out.print("10");
        }
        else if(h>50&&s>60)
        {
            System.out.print("9");
        }
        else if(s>60&&sp>100)
        {
            System.out.print("8");
        }
        else if(h>50&&sp>100)
        {
            System.out.print("7");
        }
        else if(h>50||s>60||sp>100)
        {
            System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
    }
}