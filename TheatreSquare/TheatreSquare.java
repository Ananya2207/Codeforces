//package codeforcesa;
import java.util.*;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        long a=in.nextLong();
        long len=0;
        long bre=0;
        long res=0;
        if(n%a==0 && m%a==0)
        {
            len=n/a;
            bre=m/a;
           
        }
        else if(n%a==0 && m%a!=0)
        {
          len=n/a;
          bre=(m/a)+1;
          
        }
        else if(n%a!=0 && m%a==0)
        {
           len=(n/a)+1;
           bre=m/a;
        }
        else
        {
            len=(n/a)+1;bre=(m/a)+1;
        }

        res=len*bre;
        System.out.println(res);
    }
}
