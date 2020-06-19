//package codeforcesa4;
import java.util.*;
public class RomanAndBrowser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int e=0;
        int s=0;
        int ans=0;
        
        for(int i=0;i<k;i++)
        {//System.out.println("i="+i);
            e=0;s=0;
            for(int j=0;j<a.length;j++)
            {
                if((j-i) % k ==0){
                    //System.out.println("j="+j);
                    continue;
                }else{
                    if(a[j]==1){
                        e++;
                    }else{
                        s++;
                    }
                }
            }
            //System.out.println(Math.abs(e-s));
            if(Math.abs(e-s)>ans){
                ans=Math.abs(e-s);
            }
            
        }
        System.out.println(ans);
    }
}
