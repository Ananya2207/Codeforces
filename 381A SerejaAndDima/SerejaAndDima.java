//package codeforcesa2;
import java.util.*;
public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int s=0;
        int d=0;
        int count=0;
        for(int i=0,j=n-1;;)
        {
            if(i==j){
                if(count%2==0){
                    s=s+a[i];
                }else{
                    d=d+a[i];
                }
                break;
            }else{
                if(a[i]>a[j]){
                    
                    if(count%2==0){
                    s=s+a[i];
                    }else{
                    d=d+a[i];
                    }
                    i++;
                }else{
                    if(count%2==0){
                    s=s+a[j];
                    }else{
                    d=d+a[j];
                    }
                    j--;
                }
            }
            count++;
            
        }
        System.out.println(s+" "+d);
    }
}
