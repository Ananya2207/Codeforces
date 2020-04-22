//package codeforcesa;
import java.util.*;
public class AlyonaAndNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        long count=0;
        
        for(long i=1;i<=n;i++)
        {
            count=count + (m+i)/5 - i/5;
        }
        
        System.out.println(count);
    }
}
