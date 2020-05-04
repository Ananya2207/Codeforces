//package codef;
import java.util.*;
public class ChatRoom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        String res="hello";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==res.charAt(j))
            {
                j++;
                if(j==5)
                    break;
            }
        }
        if(j==5)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
