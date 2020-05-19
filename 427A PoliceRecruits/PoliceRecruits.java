//package codeforcesa1;
import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int crime=0;
        int police=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==-1){
                if(police>0){
                    police--;
                }else{
                    crime++;
                }
            }else{
                police=police+a[i];
            }
        }
        System.out.println(crime);
    }
}
