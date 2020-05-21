//package codeforcesa2;
import java.util.*;
public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int curr=97;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            
            int x1=Math.abs((int)s.charAt(i)-curr);
            int x2=26-Math.abs((int)s.charAt(i)-curr);
            if(x1<x2){
                count=count+x1;
                
            }else{
                count=count+x2;
                
            }
            curr=(int)s.charAt(i);
           // System.out.println("x1="+x1+" x2="+x2);
        }
        System.out.println(count);
    }
}
