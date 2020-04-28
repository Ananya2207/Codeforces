//package codef;
import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int u=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                u++;
            }
            else
            {
                l++;
            }
        }
        //System.out.println("u="+u);
        //System.out.println("l="+l);
        String result="";
        if(u>l)
        {
            result=s.toUpperCase();
        }
        else
        {
            result=s.toLowerCase();
        }
        System.out.println(result);
    }
}
