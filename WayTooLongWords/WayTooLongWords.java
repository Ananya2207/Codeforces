//package codeforcesa;
import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String s[]=new String[n+1];
        String res="";
        for(int i=0;i<=n;i++)
        {
            s[i]=in.nextLine();
        }
//        for(int i=0;i<=n;i++)
//        {
//            System.out.println(s[i]);
//        }
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            continue;
            //System.out.println("i="+i+"  "+s[i]);
            if(s[i].length() <= 10)
            {
                System.out.println(s[i]);
            }
            else
            {
                System.out.print(s[i].charAt(0));
                System.out.print(String.valueOf(s[i].length()-2));
                System.out.print(s[i].charAt(s[i].length()-1));
                System.out.println("");
            }
        }
    }
}

