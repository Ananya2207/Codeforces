//package codeforcespage2;
import java.util.*;
public class AlmostPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<6)
        {
            System.out.println("0");
        }
        else{
            int total=0;
            for(int i=6;i<=n;i++)
            {   int count=0;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        boolean status=isPrime(j);
                        if(status==true)
                        {
                            count++;
                            if(count==3)
                                break;
                        }
                    }
                }
                if(count==2)
                    total=total+1;
            }
            System.out.println(total);
        }
    }
    public static boolean isPrime(int n)
    {
        
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
