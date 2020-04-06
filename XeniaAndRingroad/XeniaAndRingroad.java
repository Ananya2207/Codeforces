//package codeforcesb;
import java.util.*;
public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[m];
        
        for(int i=0;i<m;i++)
        {
            a[i]=in.nextInt();
        }
        long count=0;
        long loc=1;
        for(int i=0;i<m;i++)
        {
            if(a[i]>=loc)
            {
                count=count+(a[i]-loc);
            }
            else
            {
                count=count+(n-(loc-a[i]));
            }
            loc=a[i];
        }
        
        System.out.println(count);
        
    }
}
