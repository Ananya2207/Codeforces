//package codeforcesa1;
import java.util.*;
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        while(k!=0)
        {
            if(n%10==0){
                n=n/10;
            }else{
                n--;
            }
            k--;
        }
        System.out.println(n);
    }
}
