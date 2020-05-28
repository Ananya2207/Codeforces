//package codeforcesa2;
import java.util.*;
public class BadUglyNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            if(n==1){
                System.out.println("-1");
            }else{
                System.out.print("2");
                for(int j=0;j<n-1;j++)
                {
                    System.out.print("3");
                }
                
                System.out.println("");
            }
        }
    }
}
