//package codeforcesa1;
import java.util.*;
public class EqualizePricesAgain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            int sum=0;
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
                sum=sum+a[j];
            }
            if(sum%n==0){
                System.out.println(sum/n);
            }else{
                System.out.println(sum/n +1);
            }
        }
    }
}
