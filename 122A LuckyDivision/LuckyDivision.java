//package codef;
import java.util.*;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String N=Integer.toString(n);
        int count=0;
        for(int i=0;i<N.length();i++)
        {
            if(N.charAt(i)=='4' || N.charAt(i)=='7')
            {
                count++;
            }
        }
        if(count==N.length())
        {
            System.out.println("YES");
        }
        else
        {
            if(n%4==0)
            {
                System.out.println("YES");
            }
            else if(n%7==0)
            {
                System.out.println("YES");
            }
            else if(n%44==0)
            {
                System.out.println("YES");
            }
            else if(n%47==0)
            {
                System.out.println("YES");
            }
            else if(n%74==0)
            {
                System.out.println("YES");
            }
            else if(n%77==0)
            {
                System.out.println("YES");
            }
            else if(n%447==0)
            {
                System.out.println("YES");
            }
            else if(n%474==0)
            {
                System.out.println("YES");
            }
            else if(n%477==0)
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
