//package codeforcesa4;
import java.util.*;
public class CommentaryBoxes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        int a=in.nextInt();
        int b=in.nextInt();
        long ans=0;
        if(n<m){
            long x=n*b;
            long y=(m-n)*a;
            ans=Math.min(x, y);
        }else{
            if(n%m!=0){
                long rem1=n%m;
                long rem2=m-(n%m);
                long x=rem1*b;
                long y=rem2*a;
                ans=Math.min(x, y);
            }
        }
        System.out.println(ans);
    }
}
