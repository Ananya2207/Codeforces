//package codeforcesa2;
import java.util.*;
public class Candies1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            for (int pw = 2; pw < 30; ++pw) {
			int val = (1 << pw) - 1;
			if (n % val == 0) {
				System.out.println(n/val);
				break;
			}
		}
        }
    }
}
