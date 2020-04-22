//package codeforcesa;
import java.util.*;
public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=in.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            a[i]=in.nextInt();
        }
        int flag=0;
        for(int i=0;i<n-1;)
        {
            if(i+a[i]==t-1)
            {
                System.out.println("YES");
                flag=1;
            }
            
                i=i+a[i];
            
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
    }
}
