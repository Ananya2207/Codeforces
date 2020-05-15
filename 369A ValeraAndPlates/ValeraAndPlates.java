//package codeforcespage2;
import java.util.*;
public class ValeraAndPlates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int wash=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                if(m==0){
                    wash++;
                }else{
                    m--;
                }
            }else{
                if(k==0){
                    if(m==0){
                        wash++;
                    }else{
                        m--;
                    }
                }else{
                    k--;
                }
            }
        }
        System.out.println(wash);
    }
}
