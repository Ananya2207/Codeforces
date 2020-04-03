//package codeforcesa;
import java.util.*;
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int count=1;
        int max=1;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]>=a[i])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
        
    }
}
