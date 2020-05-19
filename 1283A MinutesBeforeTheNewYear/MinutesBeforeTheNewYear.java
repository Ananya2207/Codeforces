//package codeforcesa1;
import java.util.*;
public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int h=in.nextInt();
            int m=in.nextInt();
            System.out.println(((Math.abs((h-23)))*60)+(60-m));
        }
    }
}
