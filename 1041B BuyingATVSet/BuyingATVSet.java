//package codeforcesa3;
import java.util.*;
public class BuyingATVSet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long x=in.nextLong();
        long y=in.nextLong();
        long gcd=GCD(x,y);
        x=x/gcd;
        y=y/gcd;
        long ans=Math.min(a/x, b/y);
        System.out.println(ans);
    }
    static long GCD(long a,long b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
}
