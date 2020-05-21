//package codeforcesa2;
import java.util.*;
public class Rewards {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a1=in.nextInt();
        int a2=in.nextInt();
        int a3=in.nextInt();
        int b1=in.nextInt();
        int b2=in.nextInt();
        int b3=in.nextInt();
        int n=in.nextInt();
        int req=0;
        if((a1+a2+a3)%5==0){
            req=req+((a1+a2+a3)/5);
        }else{
            req=req+((a1+a2+a3)/5)+1;
        }
        if(((b1+b2+b3)%10==0)){
            req=req+((b1+b2+b3)/10);
        }else{
            req=req+((b1+b2+b3)/10)+1;
        }
        if(req<=n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
