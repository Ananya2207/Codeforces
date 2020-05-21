//package codeforcesa2;
import java.util.*;
public class HQ9plus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9')
            {
                flag=1;
                System.out.println("YES");
                break;
            }
        }
        if(flag==0){
            System.out.println("NO");
        }
    }
}
