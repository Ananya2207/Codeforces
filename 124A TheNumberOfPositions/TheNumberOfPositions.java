//package codeforcesa2;
import java.util.*;
public class TheNumberOfPositions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        n=n-a;
        if(n>=b+1){
            System.out.println(b+1);
        }else{
            System.out.println(n);
        }
    }
}
