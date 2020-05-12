//package codeforcespage2;
import java.util.*;
public class PerfectSquares {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                al.add(a[i]);
            }
            else
            {
                double x=Math.sqrt(a[i]);
                double floor=Math.floor(x);
                if(x-floor>0)
                {
                    al.add(a[i]);
                }
                }
        }
        //System.out.println(al);
        Collections.sort(al);
        System.out.println(al.get(al.size()-1));
    }
}
