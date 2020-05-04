//package codef;
import java.math.BigInteger;
import java.util.*;
public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=in.nextInt();
        String s="";
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                s=s+'1';
            }
            else
            {
                s=s+'0';
            }
        }
        BigInteger A=new BigInteger(s);
        BigInteger B=BigInteger.valueOf(t);
        
        if(n==1 && t>9)
        {
            System.out.println("-1");
        }
        else
        {
        if(A.mod(B)==BigInteger.ZERO)
        {//System.out.println("in");
            System.out.println(A);
        }
        else
        {
            BigInteger rem;
            rem=A.mod(B);
            A=A.add(B.subtract(rem));
            if(A.mod(B)==BigInteger.ZERO)
            {//System.out.println("in");
            System.out.println(A);
            }
            else
            {
                System.out.println("-1");
            }
        }
        }
    }
}
