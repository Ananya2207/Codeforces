//package codef;
import java.util.*;
public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<=n/2;i++)
        {
            int rem=n-i;
            if(rem%i==0)
            {
                //System.out.println("rem="+rem+"i="+i);
                count++;
            }
        }
        System.out.println(count);
    }
}
