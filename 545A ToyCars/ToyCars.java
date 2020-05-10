//package codeforcespage2;
import java.util.*;
public class ToyCars {
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
        int flag=0;
        int count=0;
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {flag=0;
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1 || a[i][j]==3)
                {flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
                al.add(i+1);
            }
        }
        System.out.println(count);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
