//package codeforcesa1;
import java.util.*;
public class ThreePilesOfCandies {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            System.out.println((a+b+c)/2);
        }
    }
}
