//package codeforcesa1;
import java.util.*;
public class BallGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       
        int ball=1;
        for(int i=1;i<=n-1;i++)
        {
           if(ball+i<=n)
           {
               ball=ball+i;
               System.out.print(ball+" ");
           }else{
               ball=ball+i-n;
               System.out.print(ball+" ");
           }
        }
    }
}
