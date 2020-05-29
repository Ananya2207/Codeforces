//package codeforcesa3;
import java.util.*;
public class RoadToZero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long x=in.nextLong();
            long y=in.nextLong();
            long a=in.nextLong();
            long b=in.nextLong();
            if(2*a>b){
                long min=Math.min(x, y);
                long max=Math.max(x, y);
                long ans=min*b;
                ans+=(max-min)*a;
                System.out.println(ans);
            }else{
                System.out.println((x+y)*a);
            }
        }
    }
}
