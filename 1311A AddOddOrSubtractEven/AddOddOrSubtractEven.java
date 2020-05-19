//package codeforcesa1;
import java.util.*;
public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            if(a==b){
                System.out.println("0");
            }else if(a<b){
                if((b-a)%2==0)
                {
                    System.out.println("2");
                }else{
                    System.out.println("1");
                }
            }else{
                if((a-b)%2==0)
                {
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }
        }
    }
}
