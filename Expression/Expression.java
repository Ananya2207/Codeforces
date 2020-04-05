//package codeforcesa;
import java.util.*;
public class Expression {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        int res1=a*b*c;
        int res2=(a*b)+c;
        int res3=a+(b*c);
        int res4=a*(b+c);
        int res5=(a+b)*c;
        int res6=a+b+c;
        int x=Math.max(res1, res2);
        int y=Math.max(res3, res4);
        int z=Math.max(x, y);
        int res=Math.max(z, res5);
        int fina=Math.max(res, res6);
        System.out.println(fina);
    }
}
