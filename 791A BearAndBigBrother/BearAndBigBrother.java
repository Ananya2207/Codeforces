//package codeforcesa1;
import java.util.*;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int count=0;
        while(a<=b){
            a=a*3;
            b=b*2;
            count++;
        }
        System.out.println(count);
    }
}
