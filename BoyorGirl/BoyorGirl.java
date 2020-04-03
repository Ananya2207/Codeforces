//package codeforcesa;
import java.util.*;
public class BoyorGirl {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            hs.add(c);
        }
        //System.out.println(hs.size());
        if(hs.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
