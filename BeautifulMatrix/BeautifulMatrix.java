package codeforcesa;
import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(a[i][j]==1)
                {
                    count=Math.abs(2-i)+Math.abs(2-j);
                }
            }
        }
        System.out.println(count);
    }
}
