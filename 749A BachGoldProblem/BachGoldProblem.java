//package codef;
import java.util.*;
public class BachGoldProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0)
        {
            System.out.println(n/2);
            for(int i=0;i<n/2;i++)
            {
                System.out.print("2"+" ");
            }
        }
        else
        {
            for(int i=3;  ;i=i+2   )
            {
                boolean prime=isPrime(i);
                if(prime==true)
                {
                    if((n-i)%2==0)
                    {
                        System.out.println(((n-i)/2)+1);
                        for(int p=0;p<(n-i)/2;p++)
                        {
                            System.out.print("2"+" ");
                        }
                        System.out.print(i);
                        break;
                    }
                    else{
                        continue;
                    }
                }
                else
                {
                    continue;
                }
            }
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
