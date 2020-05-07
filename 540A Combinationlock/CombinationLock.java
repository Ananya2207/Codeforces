//package codeforcespage2;
import java.util.*;
public class CombinationLock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String t=in.nextLine();
        //System.out.println(s);
        //System.out.println(t);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(Math.abs(s.charAt(i)-t.charAt(i))<5)
            {
                count=count+ Math.abs(s.charAt(i)-t.charAt(i));
            }
            else
            {
                count=count+(10-Math.abs(s.charAt(i)-t.charAt(i)));
            }
        }
        System.out.println(count);
    }
}
