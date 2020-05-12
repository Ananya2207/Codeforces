//package codeforcespage2;
import java.util.*;
public class NewYearAndDays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.charAt(s.length()-1)=='k')
        {
            int end=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==' ')
                {
                   end=j;
                   break;
                }
            }
            String d=s.substring(0, end);
            int day=Integer.parseInt(d);
            if(day==5 || day==6)
            {
                System.out.println("53");
            }
            else{
                System.out.println("52");
            }
        }
        else
        {
            int end=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==' ')
                {
                   end=j;
                   break;
                }
            }
            String m=s.substring(0, end);
            int month=Integer.parseInt(m);
            if(month<=29)
            {
                System.out.println("12");
            }
            else if(month==30)
            {
                System.out.println("11");
            }
            else{
                System.out.println("7");
            }
        }
    }
}
