//package codeforcesa1;
import java.util.*;
public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int count=1;
        int max=1;
        for(int i=0;i<n-1;)
        {
            if(a[i+1]>a[i]){
                //System.out.println("i="+i);
                count++;
                i++;
            }else{
                //System.out.println("else i="+i);
                if(count>max){
                    max=count;
                    //System.out.println("count="+count);
                }
                count=1;
                i++;
            }
        }
        if(count>max)
            max=count;
        System.out.println(max);
    }
}
