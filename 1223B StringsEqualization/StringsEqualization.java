//package codeforcesa4;
import java.util.*;
public class StringsEqualization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        in.nextLine();
        for(int k=0;k<q;k++)
        {
            String s=in.nextLine();
            String t=in.nextLine();
            boolean ss[]=new boolean[27];
            boolean tt[]=new boolean[27];
            for(int i=0;i<s.length();i++)
            {
                ss[s.charAt(i)-'a']=true;
            }
            for(int i=0;i<s.length();i++)
            {
                tt[t.charAt(i)-'a']=true;
            }
            int flag=0;
            for(int i=0;i<ss.length;i++)
            {
                if(ss[i]==true && tt[i]==true){
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
}
