//package codeforcesa2;
import java.util.*;
public class FakeNews {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        String res="heidi";
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==res.charAt(count)){
                count++;
            }
            if(count==5){
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
