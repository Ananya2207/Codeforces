//package codeforcesa1;
import java.util.*;
public class FileName {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)=='x' && s.charAt(i+1)=='x' && s.charAt(i+2)=='x')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
