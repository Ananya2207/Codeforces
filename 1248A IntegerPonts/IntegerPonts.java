//package codeforcesa3;
import java.util.*;
public class IntegerPonts {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            long odd1=0;long even1=0;
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
                if(a[j]%2==0){
                    even1++;
                }else{
                    odd1++;
                }
            }
            int m=in.nextInt();
            int b[]=new int[m];
            long odd2=0;long even2=0;
            for(int j=0;j<m;j++)
            {
                b[j]=in.nextInt();
                if(b[j]%2==0){
                    even2++;
                }else{
                    odd2++;
                }
            }
            long x=(odd1*odd2)+(even1*even2);
            System.out.println(x);
            
            
        }
    }
}
