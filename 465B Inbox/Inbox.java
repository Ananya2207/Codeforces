//package codeforcesa4;
import java.util.*;
public class Inbox {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int cnt=0;
        int flag=0;
        for(int i=0;i<n-2;i++)
        {
            if(a[i]==1){
                flag=0;
                cnt++;
                if(a[i+1]==0 && a[i+2]==1){
                    a[i+1]=1;
                }
                if(a[i+1]==0 && a[i+2]==0){
                    flag=1;
                    cnt++;
                }
            }else{
                continue;
            }
        }
        
        if(n>2){
        if(a[n-3]==0){
            if(a[n-2]==1){
                flag=0;
                cnt++;
            }
            if(a[n-1]==1){
                flag=0;
                cnt++;
            }
        }else{
            if(a[n-2]==0 && a[n-1]==0){
                
            }
            else if(a[n-2]==1 && a[n-1]==0){
                flag=0;
                cnt+=1;
            }else{
                flag=0;
                cnt+=2;
            }
        }
        }
        else{
            for(int i=0;i<n;i++)
            {
                if(a[i]==1){
                    cnt++;
                }
            }
        }
        if(flag==1){
            cnt--;
        }
        System.out.println(cnt);
        
        
    }
}
