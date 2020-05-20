//package codeforcesa1;
import java.util.*;
public class AntonAndDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k2=in.nextInt();
        int k3=in.nextInt();
        int k5=in.nextInt();
        int k6=in.nextInt();
        int min1=Math.min(k5, k6);
        int min=Math.min(min1, k2);
        //System.out.println("min="+min);
        int sum=min*256;
        //System.out.println("sum");
        k2=k2-min;
        int minn=Math.min(k2, k3);
        sum=sum+(minn*32);
        System.out.println(sum);
        
    }
}
