//package codeforcesa3;
import java.util.*;
public class Chocolates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        long sum=a[n-1];
        int x=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sum+=Math.min(a[i], x-1);
            x=Math.min(a[i], x-1);
            if(x==0)break;
            //System.out.println("sum="+sum);
        }
        System.out.println(sum);
    }
}
