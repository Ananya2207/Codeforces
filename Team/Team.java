//package codeforcesa;
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int count=0;
        int total=0;
        for(int i=0;i<n;i++)
        {count=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j]==1)
                {
                    count++;
                }
            }
            if(count>=2)
            {
                total++;
            }
        }
        System.out.println(total);
    }
}
