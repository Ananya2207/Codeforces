//package codeforcespage2;
import java.util.*;
public class IsItRated {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i][0] != a[i][1])
            {   flag=1;
                System.out.println("rated");
                break;
            }
        }
        
        int flag1=0;
        if(flag==0)
        {
            for(int i=0;i<n-1;i++)
            {
                if(a[i][0]>=a[i+1][0])
                {
                    continue;
                }
                else{
                    flag1=1;
                    break;
                }
            }
            if(flag1==0){
            System.out.println("maybe");
        }
        else{
            System.out.println("unrated");
        }
        }
        
        
        
    }
}
