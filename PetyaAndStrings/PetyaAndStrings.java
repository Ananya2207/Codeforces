package codeforcesa;
import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        int res=a.compareToIgnoreCase(b);
        if(res<0)
        {
            System.out.println("-1");
            
        }
        else if(res>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
            
    }
}
