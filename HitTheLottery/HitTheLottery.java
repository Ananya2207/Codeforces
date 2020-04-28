//package codef;
import java.util.*;
public class HitTheLottery {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        count=count+n/100;
        n=n%100;
        
        count=count+n/20;
        n=n%20;
        
        count=count+n/10;
        n=n%10;
        
        count=count+n/5;
        n=n%5;
        
        count=count+n/1;
        n=n%1;
        System.out.println(count);
        
        
    }
}
