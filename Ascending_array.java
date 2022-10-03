import java.util.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++)
        {
            if (arr[j]>=arr[j+1]){
                c=1;
                break;
            }
        }
        if(c==0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
