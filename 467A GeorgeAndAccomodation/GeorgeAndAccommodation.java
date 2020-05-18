//package codeforcesa1;
import java.util.*;
public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][2];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
            if(a[i][1]-a[i][0]>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
