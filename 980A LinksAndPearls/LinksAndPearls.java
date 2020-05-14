//package codeforcespage2;
import java.util.*;
public class LinksAndPearls {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int pearl=0;
        int link=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='o'){
                pearl++;
            }
            else{
                link++;
            }
        }
        if(pearl==0){
            System.out.println("YES");
            return;
        }
        if(link%pearl==0)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
