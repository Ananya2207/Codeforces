package codeforcesa2;
import java.util.*;
public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=in.nextInt();
            int n=in.nextInt();
            int m=in.nextInt();
            while(x>0 && x/2+10<x && n!=0){
                
                    x=x/2 +10;
                    n--;
                }
            if(x<=m*10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
        }
    }
}
