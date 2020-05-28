//package codeforcesa2;
import java.util.*;
public class PaymentWithoutChange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long n=in.nextLong();
            long S=in.nextLong();
            if(b>=S){
                System.out.println("YES");
            }else{
                if(b>=S%n){
                    b=b-(S%n);
                    S=S-(S%n);
                    //System.out.println("S="+S);
                    //System.out.println("b="+b);
                    if(n*a >= S){
                        System.out.println("YES");
                    }else{
                        if(b>=(S-(n*a))){
                            System.out.println("YES");
                        }else{
                            System.out.println("NO");
                        }
                    }
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
//1
//982631932 161735902 880895728 923078537
