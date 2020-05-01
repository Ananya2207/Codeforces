//package codef;
import java.util.*;
public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cubes=0;
        int presum=0;
        int sum=0;
        int count=0;
        for(int i=1;sum<=n;i++)
        {
            cubes=i+presum;
            presum=cubes;
            sum=sum+cubes;
            //System.out.println("cubes="+cubes);
            count++;
        }
        System.out.println(count-1);
        //System.out.println("sum="+sum);
    }
}
