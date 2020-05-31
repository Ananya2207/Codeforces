//package codeforcesa3;
import java.util.*;
public class RoadsideTrees {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++)
        {
            h[i]=in.nextInt();
        }
        int pos=0;
        int ans=0;
        if(n==1){
            System.out.println(h[0]+1);
            return;
        }
        for(int i=0;i<n-1;i++)
        {
            ans+=2;
            ans+=(h[i]-pos);
            if(h[i+1]<h[i]){
                ans+=(h[i]-h[i+1]);
                pos=h[i+1];
            }else{
                pos=h[i];
            }
        }
        ans++;
        if(n!=1){
            if(h[n-1]>h[n-2]){
                ans+=(h[n-1]-h[n-2]);
            }
        }
        System.out.println(ans);
    }
}
