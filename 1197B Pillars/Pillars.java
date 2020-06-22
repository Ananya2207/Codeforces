//package codeforcesa4;
import java.util.*;
public class Pillars {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int max=0;
        int ind=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]>max){
                max=a[i];
                ind=i;
            }
        }
        int flag=0;
        for(int i=ind;i>=1;i--)
        {
           if(a[i]>a[i-1]){
               continue;
           }else{
               flag=1;
               break;
           }
        }
        for(int i=ind;i<n-1;i++)
        {
            if(a[i]>a[i+1]){
                continue;
            }else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}
