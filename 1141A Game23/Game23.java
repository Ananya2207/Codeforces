//package codeforcesa3;
import java.util.*;
public class Game23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        if(m%n==0){
            if(m==n){
                System.out.println("0");
            }else{
                int count=0;
                int x=m/n;
                int flag=0;
                while(x!=1){
                    if(x%3==0){
                        x=x/3;
                        count++;
                    }else if(x%2==0){
                        x=x/2;
                        count++;
                    }else{
                        flag=1;
                        System.out.println("-1");
                        break;
                    }
                }
                if(flag==0)
                System.out.println(count);
            }
        }else{
            System.out.println("-1");
        }
    }
}
