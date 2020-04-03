//package codeforcesa;
import java.util.*;
public class FootBall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=1;
        int flag=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count==7)
            {flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
