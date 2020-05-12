//package codeforcespage2;
import java.util.*;
public class PineappleIncident {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int s=in.nextInt();
        int x=in.nextInt();
        x=x-t;
        if(x<s)
        {
            if(x==0)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else
        {
            if(x%s==0 || x%s==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            }
    }
}
