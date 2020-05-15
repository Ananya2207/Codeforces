//package codeforcespage2;
import java.util.*;
public class Tetris {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<m;i++)
        {
            al.add(in.nextInt());
        }
        int fre[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            fre[i-1]=Collections.frequency(al, i);
        }
        int min=1000;
        for(int i=0;i<n;i++)
        {
            if(fre[i]<=min)
            {
                min=fre[i];
            }
        }
        System.out.println(min);
    }
}
