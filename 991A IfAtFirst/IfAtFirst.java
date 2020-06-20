//package codeforcesa4;
import java.util.*;
public class IfAtFirst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int n=in.nextInt();
        if(c<=Math.min(a, b)){
            a=a-c;
            b=b-c;
            if(a<0 || b<0){
                System.out.println("-1");
            }else{
                if(a+b+c+1<=n){
                    System.out.println(n-(a+b+c));
                }else{
                    System.out.println("-1");
                }
            }
        }else{
            System.out.println("-1");
        }
    }
}
