//package codeforcesa2;
import java.util.*;
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.length()>4){
            int flag1=0;
            int flag2=0;
            int flag3=0;
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>=65 && s.charAt(i)<=90){
                    flag1=1;
                }
                if(s.charAt(i)>=97 && s.charAt(i)<=122){
                    flag2=1;
                }
                if(s.charAt(i)>=48 && s.charAt(i)<=57){
                    flag3=1;
                } 
            }
            if(flag1==1 && flag2==1 && flag3==1){
                System.out.println("Correct");
            }else{
                System.out.println("Too weak");
            }
        }else{
            System.out.println("Too weak");
        }
    }
}
