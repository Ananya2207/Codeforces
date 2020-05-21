//package codeforcesa2;
import java.util.*;
public class GoodMatrixElements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j){
                  sum=sum+a[i][j];  
                }
                if(i==n/2){
                  sum=sum+a[i][j];  
                }
                if(j==n/2){
                    sum=sum+a[i][j];
                }
                if(j==n-i-1){
                    sum=sum+a[i][j];
                }
            }
        }
        sum=sum-(3*a[n/2][n/2]);
        System.out.println(sum);
        
    }
}
