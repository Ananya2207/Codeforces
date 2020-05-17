//package codeforcesa1;
import java.util.*;
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int w=in.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++)
        {
            sum=sum+(k*i);
        }
        if(sum>n){
            System.out.println(sum-n);
        }else{
            System.out.println("0");
        }
    }
}
