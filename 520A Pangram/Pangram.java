//package codeforcesa1;
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        HashSet hs=new HashSet();
        String low=s.toLowerCase();
        for(int i=0;i<low.length();i++)
        {
            hs.add(low.charAt(i));
        }
        if(hs.size()==26)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
