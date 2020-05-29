//package codeforcesa3;
import java.util.*;
public class FrreCash {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h[]=new int[n];
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
            h[i]=in.nextInt();
            m[i]=in.nextInt();
        }
        int ans=1;
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(h[i]==h[i+1] && m[i]==m[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count>ans){
                ans=count;
            }
        }
        System.out.println(ans);
    }
}
