//package codeforcesa1;
import java.util.*;
public class EhAbAnDgCd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=in.nextInt();
            System.out.println("1"+" "+(x-1));
//            int flag=0;
//            for(int a=1;a<=x +1;a++)
//            {
//                for(int b=1;b<=x +1;b++)
//                {
//                    if(gcd(a,b)+lcm(a,b)==x)
//                    {flag=1;
//                        System.out.println(a+" "+b);
//                        break;
//                    }
//                }
//                if(flag==1)
//                    break;
//            }
        }
    }
//    public static int gcd(int num1,int num2)
//    {
//        int min=Math.min(num1, num2);
//        while(true)
//        {
//            if(num1%min==0 && num2%min==0)
//            {
//                return min;
//            }else{
//                min--;
//            }
//        }
//    }
//    public static int lcm(int num1,int num2)
//    {
//        int max=Math.max(num1, num2);
//        int count=2;
//        while(true){
//        if(max%num1==0 && max%num2==0)
//        {
//            return max;
//        }else{
//            max=max*count;
//            count++;
//        }
//        }
//    }
}
