//package codeforcespage2;
import java.util.*;
public class ABlendOfSpringtime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.length()<3){
            System.out.println("No");
        }else{
            int flag=0;
            for(int i=0;i<s.length()-2;i++)
            {
                if(s.substring(i, i+3).equals("ABC") || s.substring(i, i+3).equals("ACB") || s.substring(i, i+3).equals("BAC") || s.substring(i, i+3).equals("BCA") || s.substring(i, i+3).equals("CAB") || s.substring(i, i+3).equals("CBA"))
                {flag=1;
                    System.out.println("Yes");
                    break;
                }
            }
            if(flag==0){
                System.out.println("No");
            }
        }
    }
}
