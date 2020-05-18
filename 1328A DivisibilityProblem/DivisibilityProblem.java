//package codeforcesa1;
import java.util.*;
public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            if(a<b){
                System.out.println(b-a);
            }
            else{
                if(a%b==0){
                    System.out.println("0");
                }else{
                    System.out.println(b-(a%b));
                }
            }
        }
    }
}
