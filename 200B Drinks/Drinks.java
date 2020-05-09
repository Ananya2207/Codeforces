//package codeforcespage2;
import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        sum=sum/n;
        System.out.println(sum);
    }
}
