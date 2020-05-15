//package codeforcespage2;
import java.util.*;
public class HongcowLearnsTheCyclicShift {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String res="";
        HashSet<String> hs=new HashSet<String> ();
        
        for(int i=0;i<s.length();i++)
        {   res="";
            for(int j=i;j<s.length();j++)
            {
                res=res+s.charAt(j);
            }
            for(int p=0;p<i;p++)
            {
                res=res+s.charAt(p);
            }
            hs.add(res);
        }
        System.out.println(hs.size());
    }
}
