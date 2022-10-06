import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,rem,d=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n,m=n;
        while(temp!=0)
        {
            d++;
            temp=temp/10;
        }
        int arr[]=new int[d];
        int i=0;
        while(m>0)
        {
            rem=m%10;
            arr[i]=rem;
            m=m/10;
            i++;
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++)
        {
            if(j!=0)
            {
                if(arr[j]==arr[j-1])
                {
                    c=1;
                    break;
                }
            }
        }
        if(c==0)
        System.out.print("Unique Number");
        else
        System.out.print("Not Unique Number");
    }
}