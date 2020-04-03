//package codeforcesa;
import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner in =new Scanner((System.in));
        int w=in.nextInt();
        if(w%2==0 && w>2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
