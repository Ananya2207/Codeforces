//package codeforcesa2;
import java.util.*;
public class Dubstep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int flag=0;
        for(int i=0;i<s.length();)
        {
            if(i<s.length()-2  &&  s.substring(i, i+3).equals("WUB")){
                if(flag==1){
                    System.out.print(" ");
                }
                i=i+3;
                flag=0;
            }else{
                flag=1;
                System.out.print(s.charAt(i));
                i++;
            }
        }
        
    }
}
