//package codeforcesa1;
import java.util.*;
public class PuzzlePieces {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            if(n==1){
                System.out.println("YES");
            }else if(m==1){
                System.out.println("YES");
            }
            else if(n==2 && m==2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
