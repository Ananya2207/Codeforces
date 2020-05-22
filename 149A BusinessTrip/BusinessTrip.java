//package codeforcesa2;
import java.util.*;
public class BusinessTrip {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int k=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<12;i++)
        {
            al.add(in.nextInt());
        }
        if(k==0){
            System.out.println("0");
            return;
        }
        Collections.sort(al);
        int sum=0;
        int count=0;
        int flag=0;
        for(int i=11;i>=0;i--)
        {
            sum=sum+(int)al.get(i);
            count++;
            if(sum>=k){
                flag=1;
                System.out.println(count);
                break;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
}
