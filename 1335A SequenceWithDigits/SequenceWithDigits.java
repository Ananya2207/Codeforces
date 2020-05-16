//package codeforcesa1;
import java.util.*;
public class SequenceWithDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a1=in.nextLong();
            long k=in.nextLong();
            while(k>1)
            {
                long min=mindigit(a1);
                if(min==0){
                    a1=a1;
                    k--;break;
                }
                long max=maxdigit(a1);
                a1= a1 +(min*max);
                k--;
            }
            System.out.println(a1);
        }
    }
    public static long mindigit(long num)
    {
        int a[]=new int[18];
        int count=0;
        int min=10;
        while(num!=0)
        {
            int rem=(int) (num%10);
            a[count++]=rem;
            if(rem==0){
                min=0;break;
            }
            if(rem<min)
                min=rem;
            num=num/10;
        }
        return min;
    }
    public static long maxdigit(long num)
    {
        int a[]=new int[18];
        int count=0;
        int max=0;
        while(num!=0)
        {
            int rem=(int) (num%10);
            a[count++]=rem;
            if(rem==9){
                max=9;break;
            }
            if(rem>max)
                max=rem;
            num=num/10;
        }
        return max;
    }
}
