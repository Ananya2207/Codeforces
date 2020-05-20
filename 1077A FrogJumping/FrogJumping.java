//package codeforcesa1;
import java.util.*;
public class FrogJumping {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=in.nextLong();
            long b=in.nextLong();
            long k=in.nextLong();
            if(k%2==0)
            {
                System.out.println((a-b)*(k/2));
            }else{
                System.out.println(((a-b)*(k/2))+a);
            }
        }
    }
}
