//package codeforcesa1;
import java.util.*;
public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            System.out.println(n-(n/2+1));
        }
    }
}
