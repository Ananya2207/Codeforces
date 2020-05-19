//package codeforcesa1;
import java.util.*;
public class EpicGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        int flag=0;
        while(n>-1)
        {
            if(flag==0){
                int num=gcd(a,n);
                if(num>n){
                    System.out.println("1");break;
                }else{
                n=n-num;}
                //System.out.println("gcd="+num);
                flag=1;
            }else{
                int num=gcd(b,n);
                if(num>n){
                    System.out.println("0");break;
                }else{
                n=n-num;}
                //System.out.println("gcd="+num);
                flag=0;
            }
        }
        
        
    }
    public static int gcd(int num1,int num2)
    {
        int min=Math.min(num1, num2);
        if(min==0){
            if(num1!=0){
                return num1;
            }else{
                return num2;
            }
        }
        while(true)
        {
            if(num1%min==0 && num2%min==0)
            {
                return min;
            }else{
                min--;
            }
        }
    }
}
