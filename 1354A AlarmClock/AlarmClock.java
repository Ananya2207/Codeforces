//package codeforcesa1;
import java.util.*;
public class AlarmClock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            long d=in.nextLong();
            
            if(b>=a)
            {
                System.out.println(b);
            }
            else{
                if(d>=c)
                {
                    System.out.println("-1");
                }
                else{
                    long diff=c-d;
                    long total=a-b;
                    long ans=0;
                    if(total%diff==0)
                    {
                        ans=total/diff;
                    }else{
                        ans=total/diff +1;
                    }
                    System.out.println(ans*c + b);
                }
            }
        }
    }
}
