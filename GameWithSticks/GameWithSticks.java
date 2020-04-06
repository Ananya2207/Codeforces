//package codeforcesa;
import java.util.*;
public class GameWithSticks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int min=Math.min(n, m);
        if(min%2==0)
        {
            System.out.println("Malvika");
        }
        else
        {
            System.out.println("Akshat");
        }
    }
}
