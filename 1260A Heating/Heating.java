//package codeforcesa3;
import java.util.*;
public class Heating {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=in.nextInt();
            int sum=in.nextInt();
            if(sum%c==0){
                int k=sum/c;
                System.out.println((int)Math.pow(k, 2)*c);
            }else{
                int k=sum/c;
                int rem=sum%c;
                int x=c-rem;
                int ans=(((int)Math.pow(k, 2)*x) + ((int)Math.pow(k+1, 2)*rem));
                System.out.println(ans);
            }
        }
    }
}
