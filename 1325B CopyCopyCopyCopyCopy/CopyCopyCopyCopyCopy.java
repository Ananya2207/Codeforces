package codeforcesa1;
import java.util.*;
public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            HashSet hs=new HashSet();
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
                hs.add(a[j]);
            }
            System.out.println(hs.size());
            
        }
    }
}
