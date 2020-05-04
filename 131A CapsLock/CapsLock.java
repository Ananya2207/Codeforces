//package codef;
import java.util.*;
public class CapsLock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int caps=0;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)>=65 && s.charAt(i)<=90)
           {
               caps++;
           }
           if(s.charAt(0)>=65 && s.charAt(0)<=90)
           {
               flag=1;
           }
            
        }
        //System.out.println("caps="+caps);
        //System.out.println(s.length()-1);
        //System.out.println("flag="+flag);
        if(caps==s.length())
        {
            System.out.println(s.toLowerCase());
        }
        else if(caps==s.length()-1 && flag==0)
        {//System.out.println("in");
            String res="";
            res=res+s.substring(0, 1).toUpperCase();
            res=res+s.substring(1, s.length()).toLowerCase();
            System.out.println(res);
        }
        else{
            System.out.println(s);
        }
        
        
    }
}
