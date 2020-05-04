//package codef;
import java.util.*;
public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int flag=0;
        for(int j=0;j<3;j++)
        {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+a[i][j];
            }
            if(sum==0)
            {
                continue;
            }
            else{flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
