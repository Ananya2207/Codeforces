//package codeforcesa4;
import java.util.*;
public class VovaAndTrain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int L=in.nextInt();
            int x=in.nextInt();
            int l=in.nextInt();
            int r=in.nextInt();
            int ans=0;
            ans=(l-1)/x;
            //System.out.println("ans="+ans);
            int next=0;
            if((r+1)%x==0){
                next=(r+1)/x;
            }else{
                next=((r+1)/x)+1;
            }
            int num=x*next;
            //System.out.println("num="+num);
            int y=0;
            if(num<=L){
                y=L-num+1;
            }
            //System.out.println("y/x="+(y/x));
            if(y%x==0)
            ans+=(y/x);
            else
                ans+=((y/x)+1);
            
            System.out.println(ans);
            t--;
        }
    }
}
