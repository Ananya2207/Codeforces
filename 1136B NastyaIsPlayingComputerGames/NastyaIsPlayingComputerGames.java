//package codeforcesa3;
import java.util.*;
public class NastyaIsPlayingComputerGames {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int small=Math.min(k-1, n-k);
        int large=Math.max(k-1, n-k);
        System.out.println((2*n +1)+(2*small)+(large));
    }
}
