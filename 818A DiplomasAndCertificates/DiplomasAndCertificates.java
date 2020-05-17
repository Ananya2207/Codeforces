//package codeforcesa1;
import java.util.*;
public class DiplomasAndCertificates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long k=in.nextLong();
        if(k+1>n/2)
        {
            System.out.println("0 "+"0 "+n);
        }else{
            long x=(n/2)/(k+1);
            System.out.println(x+" "+(x*k)+" "+(n-(x +(x*k))));
        }
    }
}
