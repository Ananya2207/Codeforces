//package codeforcesa;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s[]=new String[n];
        int arr[][]=new int[n][m];
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            s[i]=in.nextLine();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=s[i].charAt(j);
            }
        }
        
        int max=0;
        int flag[]=new int[n];
        for(int i=0;i<m;i++)
        {
            max=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]>=max)
                {
                    max=arr[j][i];
                }
            }
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]==max)
                {
                    flag[j]=1;
                }
            }
            
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(flag[i]==1)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
