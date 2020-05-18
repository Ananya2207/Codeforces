//package codeforcesa1;
import java.util.*;
public class Elephant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int count=0;
        if(x%5==0){
            count=x/5;
        }else{
            count=x/5 +1;
        }
        System.out.println(count);
    }
}
