package codeforcesa;
import java.util.*;
public class Twins {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int count=0;
        int coin=0;
        for(int i=0;i<n;i++)
        {
            count=count+a[i];
            coin++;
            if(count>(sum/2))
            {
                break;
            }
        }
        System.out.println(coin);
    }
}
