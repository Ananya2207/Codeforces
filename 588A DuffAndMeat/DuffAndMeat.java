//package codeforcesa2;
import java.util.*;
public class DuffAndMeat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        int price=a[0][1];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(a[i][1]<price){
                price=a[i][1];
            }
            //System.out.println("price="+price);
            ans=ans+(price*a[i][0]);
            //System.out.println("ans="+ans);
        }
        System.out.println(ans);
    }
}
