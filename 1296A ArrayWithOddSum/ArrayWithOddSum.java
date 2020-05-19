//package codeforcesa1;
import java.util.*;
public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            int sum=0;
            int odd=0;
            int even=0;
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
                sum=sum+a[j];
                if(a[j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(sum%2==0){
                if(odd!=0 && even!=0)
                {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("YES");
            }
            
        }
    }
}
