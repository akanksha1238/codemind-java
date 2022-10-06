import java.util.*;
class Sample
{
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(i>1)
            {
                if(isPrime(i))
                {
                    System.out.println(i);
                }
            }
        }
    }
}