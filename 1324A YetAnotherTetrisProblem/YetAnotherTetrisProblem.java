//package codeforcesa2;
import java.util.*;
public class YetAnotherTetrisProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }
            int flag1=0;
            int flag2=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%2==0){
                    flag1=1;
                }else{
                    flag2=1;
                }
            }
            if(flag1==1 && flag2==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
