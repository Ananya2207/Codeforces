//package codeforcesa4;
import java.util.*;
public class Trace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        if(n%2==0){
            double ans=0;
            for(int i=n-1;i>=0;i-=2)
            {
                ans+=( (Math.PI*Math.pow(a[i], 2))-(Math.PI*Math.pow(a[i-1], 2)) );
            }
            System.out.println(ans);
        }
        else{
            double ans=0;
            for(int i=n-1;i>=1;i-=2)
            {
                ans+=( (Math.PI*Math.pow(a[i], 2))-(Math.PI*Math.pow(a[i-1], 2)) );
            }
            ans+=(Math.PI*Math.pow(a[0], 2));
            System.out.println(ans);
        }
    }
}
