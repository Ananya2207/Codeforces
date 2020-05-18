//package codeforcesa1;
import java.util.*;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int a=0;
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                a++;
            }else{
                d++;
            }
        }
        if(a==d){
            System.out.println("Friendship");
        }else if(a>d){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
}
