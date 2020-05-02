//package codef;
import java.util.*;
public class FancyFence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int minus=180-a;
            
            if(360%minus==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
