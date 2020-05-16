//package codeforcesa1;
import java.util.*;
public class Reconnaissance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Math.abs(a[i]-a[j])<=d)
                {
                    count++;
                }
            }
        }
        System.out.println(count-n);
        
    }
}
