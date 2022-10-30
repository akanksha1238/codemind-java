import java.util.*;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n,m,max;
        n=sc.nextInt();
        m=sc.nextInt();
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<n;i++)
        {
            max=0;
            for(int j=0;j<m;j++)
            {
                if(a[j][i]>max)
                {
                    max=a[j][i];
                }
            }
            System.out.println(max);
            
        }
    }
}