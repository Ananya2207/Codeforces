//package codeforcesa1;
import java.util.*;
public class MezoPlayingZoma {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        
        int right=0,left=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R'){
                right++;
            }else{
                left++;
            }
        }
        System.out.println(right+left+1);
        
    }
}
