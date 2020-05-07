//package codeforcespage2;
import java.util.*;
public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
        if(n<m)
        {
            System.out.println("-1");
        }
        else
        {
            if(n%2==0)
            {
               count=n/2; 
               while(true)
               {
                   if(count%m==0)
                       break;
                   else
                       count++;
               }
            }
            else
            {
                count=n/2 +1;
                while(true)
               {
                   if(count%m==0)
                       break;
                   else
                       count++;
               }
            }
            System.out.println(count);
        }
    }
}
