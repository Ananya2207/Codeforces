//package codeforcesa3;
import java.util.*;
public class ChungaChanga {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long x=in.nextLong();
        long y=in.nextLong();
        long z=in.nextLong();
        System.out.print((x+y)/z+" ");
        long remx=x%z;
        long remy=y%z;
        if(remx+remy>=z){
            if(remx<remy){
                System.out.print(z-remy);
            }else{
                System.out.print(z-remx);
            }
        }else{
            System.out.print("0");
        }
        
    }
}
