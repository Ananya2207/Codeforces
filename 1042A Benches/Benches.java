//package codeforcesa4;
import java.util.*;
public class Benches {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[n];
        int ansmin=0;
        int ansmax=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        ansmax=max+m;
        Arrays.sort(a);
        int x=0;
        for(int i=a.length-2;i>=0;i--)
        {
            //System.out.println("a[i]="+a[i]);
            x=(max-a[i]);
            //System.out.println("x="+x);
            if(x<=m){
                a[i]=a[i]+x;
                m=m-x;
                }
            else{
                a[i]=a[i]+m;
                m=0;break;
                }
        }
        //System.out.println("m="+m);
        if(m==0){
            int min=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]>min){
                    min=a[i];
                }
            }
            ansmin=min;
        }
        else{
            if(m%n==0)
                ansmin=a[0]+(m/n);
            else
                ansmin=a[0]+(m/n)+1;
            
        }
        System.out.println(ansmin+" "+ansmax);
        
    }
}
