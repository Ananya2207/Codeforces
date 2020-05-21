//package codeforcesa2;
import java.util.*;
public class Candies {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        if(n%m==0){
            for(int i=0;i<m;i++)
            {
                System.out.print((n/m)+" ");
            }
        }else{
            for(int i=0;i<(m-(n%m));i++)
            {
                System.out.print((n/m)+" ");
            }
            for(int i=0;i<n%m;i++)
            {
                System.out.print((n/m +1)+" ");
            }
        }
    }
}
