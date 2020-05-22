//package codeforcesa2;
import java.util.*;
public class ConstructTheString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            for(int j=0;j<n;j++)
            {
                char x=(char) ('a'+j%b);
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
