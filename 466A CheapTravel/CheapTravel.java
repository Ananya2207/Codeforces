//package codef;
import java.util.*;
public class CheapTravel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        
        double per_ride=(double)b/m;
        //System.out.println("per ride"+per_ride);
        
        if(m<=n)
        {
        
        if(a<=per_ride)
        {//System.out.println("in");
            System.out.println(n*a);
        }
        else
        {
           int total=( (n/m) * b );
           int rem=n-(n/m * m);
           if(n%m!=0)
           if(a<b)
           {
               total=total+(rem*a);
           }
           else
           {
               total=total+b;
           }
                   
            System.out.println(total);
        }
        }
        else
        {
            if(n*a<b)
            System.out.println(n*a);
            else
                System.out.println(b);
        }
    }
}
