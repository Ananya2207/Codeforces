//package codef;
import java.util.*;
public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i][0]>a[i][1])
            {
                count1++;
            }
            if(a[i][0]<a[i][1])
            {
                count2++;
            }
        }
        if(count1>count2)
        {
            System.out.println("Mishka");
        }
        else if(count2>count1)
        {
            System.out.println("Chris");
        }
        else
        {
            System.out.println("Friendship is magic!^^");
        }
    }
}
