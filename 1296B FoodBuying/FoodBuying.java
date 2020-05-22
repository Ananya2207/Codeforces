//package codeforcesa2;
import java.util.*;
public class FoodBuying {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int s=in.nextInt();
            int ans=0;
            while(true){
                int x=(s/10)*10;
                ans=ans+x;
                s=(s%10)+(x/10);
                if(s<10){
                    break;
                }
            }
            System.out.println(ans+s);
        }
    }
}
