//package codeforcesa2;
import java.util.*;
public class DieRoll {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Y=in.nextInt();
        int W=in.nextInt();
        int max=Math.max(Y, W);
        int ans=7-max;
        if(ans==6){
            System.out.println("1/1");
        }else if(ans==2){
            System.out.println("1/3");
        }else if(ans==3){
            System.out.println("1/2");
        }else if(ans==4){
            System.out.println("2/3");
        }else{
            System.out.println(ans+"/6");
        }
    }
}
