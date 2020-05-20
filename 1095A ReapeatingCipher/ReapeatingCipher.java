//package codeforcesa1;
import java.util.*;
public class ReapeatingCipher {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String res="";
        int index=1;
        for(int i=0;i<s.length();)
        {
            res=res+s.charAt(i);
            i=i+index;
            index++;
        }
        System.out.println(res);
    }
}
