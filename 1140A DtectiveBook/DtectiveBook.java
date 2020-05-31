//package codeforcesa3;
import java.util.*;
public class DtectiveBook {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int mys=a[0];
        int day=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mys){
                    mys=a[i];
            }
            if(i+1==mys){
                day++;
                
            }
        }
        System.out.println(day);
        
    }
}
