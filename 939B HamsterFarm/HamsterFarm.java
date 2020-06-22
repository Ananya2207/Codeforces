//package codeforcesa4;
import java.util.*;
public class HamsterFarm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int k=in.nextInt();
        long a[]=new long[k];
        for(int i=0;i<k;i++)
        {
            a[i]=in.nextLong();
        }
        long min=Long.MAX_VALUE;
        long no=0;
        int ind=0;
        for(int i=0;i<k;i++)
        {
            if(n%a[i]<min){
                min=n%a[i];
                no=n/a[i];
                ind=i+1;
            }
        }
        System.out.println(ind+" "+no);
    }
}
