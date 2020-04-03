package codeforcesa;
import java.util.*;
public class WordCapitalistion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s0=s.substring(0, 1);
        String news0=s0.toUpperCase();
        
        String result="";
        result=result+news0;
        for(int i=1;i<s.length();i++)
        {
            result=result+s.charAt(i);
        }
        System.out.println(result);
    }
}
