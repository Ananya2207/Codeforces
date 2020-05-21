//package codeforcesa2;
import java.util.*;
public class DataCenter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=(int)Math.floor(Math.sqrt(n));
        for(int i=x;i>0;i--)
        {
            if(n%i==0){
                System.out.println((2*i)+(2*(n/i)));
                break;
            }
        }
        
    }
}
