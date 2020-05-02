//package codef;
import java.util.*;
public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<t;i++)
        {
            sum1=0;
            sum2=0;
            int n=in.nextInt();
            int count=0;
            for(int j=n;j>=1;j--)
            {
                if(sum1<=sum2)
                {   count++;
                    sum1=(int) (sum1+Math.pow(2, j));
                }
                else
                {
                    if(count<=n/2)
                    {
                        sum2=(int) (sum2+Math.pow(2, j));
                        count++;
                    }
                    else
                    {
                        sum1=(int) (sum1+Math.pow(2, j));
                    }
                }
            }
            //System.out.println("sum1="+sum1);
            //System.out.println("sum2="+sum2);
            System.out.println(Math.abs(sum2-sum1));
            
        }
    }
}

//3
//2
//4
//6
