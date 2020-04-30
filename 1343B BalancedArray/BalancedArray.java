//package codef;
import java.util.*;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            if((n/2)%2==0)
            {
                System.out.println("YES");
                int count=2;
                int sum1=0;
                int sum2=0;
                
                for(int j=0;j<n/2;j++)
                {
                    System.out.print(count+" ");
                    sum1=sum1+count;
                    count +=2;
                }
                //System.out.println("sum1="+sum1);
                int count1=1;
                for(int j=0;j<(n/2)-1;j++)
                {
                    System.out.print(count1+" ");
                    sum2=sum2+count1;
                    count1 +=2;
                }
                //System.out.println("sum2="+sum2);
                System.out.print(sum1-sum2);
                System.out.println("");
                
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
