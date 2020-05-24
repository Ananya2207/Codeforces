//package codeforcesa2;
import java.util.*;
public class LinelandMail {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int leftmost=a[0];
        int rightmost=a[n-1];
       
        for(int i=0;i<n;i++)
        {
            if(i==0){
                System.out.println(Math.abs(a[1]-a[0])+" "+Math.abs(a[0]-a[n-1]));
            }else if(i==n-1){
                System.out.println(Math.abs(a[n-1]-a[n-2])+" "+Math.abs(a[n-1]-a[0]));
            }
            else{
                int min=0;int max=0;
                if(Math.abs(a[i]-a[i-1]) <Math.abs(a[i]-a[i+1])){
                    min=Math.abs(a[i]-a[i-1]);
                }else{
                    min=Math.abs(a[i]-a[i+1]);
                }
                if(Math.abs(a[i]-leftmost)>Math.abs(a[i]-rightmost)){
                    max=Math.abs(a[i]-leftmost);
                }else{
                    max=Math.abs(a[i]-rightmost);
                }
                System.out.println(min+" "+max);
            }
        }
    }
}
