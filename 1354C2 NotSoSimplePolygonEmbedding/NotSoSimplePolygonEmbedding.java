//package codeforcesa1;
import java.util.*;
public class NotSoSimplePolygonEmbedding {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            System.out.println(Math.cos(Math.PI/(4*n))/Math.sin(Math.PI/(2*n)));
        }
    }
}
