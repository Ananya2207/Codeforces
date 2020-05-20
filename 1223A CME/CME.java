//package codeforcesa1;
import java.util.*;
public class CME {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            if(n==2){
                System.out.println("2");
            }else if(n%2==0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
    }
}
