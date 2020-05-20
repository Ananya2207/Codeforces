//package codeforcesa1;
import java.util.*;
public class ImBoredWithLife {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=1;
        for(int i=1;i<=Math.min(a, b);i++)
        {
            ans=ans*i;
            System.out.println("ans="+ans+"  i="+i);
        }
        System.out.println(ans);
    }
}
