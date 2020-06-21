//package codeforcesa4;
import java.util.*;
public class GameOfRobots {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long k=in.nextLong();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        long sum=0;
        int curr=0;
        for(int i=0;i<n;i++)
        {
            sum+=(i+1);
            if(sum>=k){
                curr=i;
                break;
            }
        }
        long index=sum-k;
        System.out.println(a[curr-(int)index]);
    }
}
