//package codeforcespage2;
import java.util.*;
public class Greed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            al.add(in.nextInt());
        }
        Collections.sort(al);
        if(n<3)
        {
            System.out.println("YES");
        }
        else
        {
            long s=(int)al.get(al.size()-1)+(int)al.get(al.size()-2);
            if(sum<=s)
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
