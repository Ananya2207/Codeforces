//package codef;
import java.util.*;
public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int time=240-k;
        if(time<5)
        {
            System.out.println("0");
        }
        else
        {
            for(int i=0;;i++)
            {
                time=time-(5*(i+1));
                //System.out.println("time="+time);
                if(time<0)
                {
                    System.out.println(i);
                    break;
                }
                if(i==n)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
