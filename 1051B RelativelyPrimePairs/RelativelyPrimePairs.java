//package codeforcesa3;
import java.util.*;
public class RelativelyPrimePairs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long l=in.nextLong();
        long r=in.nextLong();
        System.out.println("YES");
        for(long i=l;i<=r;i=i+2)
        {
            System.out.println(i+" "+(i+1));
        }
    }
}

