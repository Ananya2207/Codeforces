//package codef;
import java.util.*;
public class ThereAreTwoTypesOfBurger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int b=in.nextInt();
            int p=in.nextInt();
            int f=in.nextInt();
            int h=in.nextInt();
            int c=in.nextInt();
            int profit=0;
            if(c>=h)
            {
                if(b/2>=f)
                {
                    profit=f*c;
                    b=b-(2*f);
                    if(b/2>=p)
                    {
                        profit=profit+(p*h);
                    }
                    else
                    {
                        profit=profit+((b/2)*h);
                    }
                    System.out.println(profit);
                }
                else
                {
                    profit=(b/2)*c;
                    System.out.println(profit);
                }
            }
            else
            {
                if(b/2>=p)
                {
                    profit=p*h;
                    b=b-(2*p);
                    if(b/2>=f)
                    {
                        profit=profit+(f*c);
                    }
                    else
                    {
                        profit=profit+((b/2)*c);
                    }
                    System.out.println(profit);
                }
                else
                {
                    profit=(b/2)*h;
                    System.out.println(profit);
                }
            }
        }
    }
}
