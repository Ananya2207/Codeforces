//package codeforcesa1;
import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        int net=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            net=net-a[i][0]+a[i][1];
            if(net>max)
                max=net;
        }
        System.out.println(max);
        
    }
}
