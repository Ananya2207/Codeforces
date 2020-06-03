//package codeforcesa3;
import java.util.*;
public class ShuffleHashing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t =in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String p=in.nextLine();
            String h=in.nextLine();
            ArrayList al=new ArrayList();
            for(int j=0;j<p.length();j++)
            {
                al.add(p.charAt(j));
            }
            Collections.sort(al);
            String pp=al.toString();
            int flag=0;
            
            for(int j=0;j<=h.length()-p.length();j++)
            {ArrayList aa=new ArrayList();
                for(int k=j;k<j+p.length();k++)
                {
                    aa.add(h.charAt(k));
                }
                Collections.sort(aa);
                String hh=aa.toString();
                if(pp.equals(hh)){
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
