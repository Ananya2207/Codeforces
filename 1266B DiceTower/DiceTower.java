//package codeforcesa3;
import java.util.*;
public class DiceTower {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            long x=in.nextLong();
            if(x<=14){
                System.out.println("NO");
            }
            else{
                if(x%14>=1 && x%14<=6){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            t--;
        }
    }
}
