//package codeforcespage2;
import java.util.*;
public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int r=in.nextInt();
        int sum=k;
        
        for(int i=2;;i++)
        {
            if(sum%10==0 || (sum-r)%10==0)
            {
                System.out.println(i-1);
                break;
            }
            else
            {
                //System.out.println("sum="+sum);
                sum=k*i;
            }
        }
    }
}
