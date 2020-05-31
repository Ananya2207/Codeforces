//package codeforcesa3;
import java.util.*;
public class DimaAndFriends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        int curr=sum % (n+1);
        int count=0;
        for(int i=1;i<=5;i++)
        {
            if((curr+i)%(n+1)==1){
                continue;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
