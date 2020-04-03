package codeforcesa;
import java.util.*;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //long n=in.nextLong();
        String n=in.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='4' || n.charAt(i)=='7')
            {
                count++;
            }
        }
        if(count==4 || count==7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
