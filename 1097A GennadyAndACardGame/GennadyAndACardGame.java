//package codef;
import java.util.*;
public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        //System.out.println(s);
        String a[]=new String[5];
        //in.nextLine();
        for(int i=0;i<5;i++)
        {
            a[i]=in.next();
        }
        int flag=0;
        for(int i=0;i<5;i++)
        {
            if(a[i].charAt(0)==s.charAt(0) || a[i].charAt(1)==s.charAt(1))
            {
                flag=1;
                System.out.println("YES"); 
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
        
    }
}
