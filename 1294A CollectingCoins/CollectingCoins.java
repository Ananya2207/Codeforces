//package codeforcespage2;
import java.util.*;
public class CollectingCoins {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int n=in.nextInt();
            ArrayList al=new ArrayList();
            al.add(a);al.add(b);al.add(c);
            Collections.sort(al);
            n=n-(((int)al.get(2)-(int)al.get(1)) + ((int)al.get(2)-(int)al.get(0)));
            //System.out.println("n="+n);
            if(n%3==0 && n>-1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}
//1
//1 1 3 1
