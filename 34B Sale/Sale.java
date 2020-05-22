//package codeforcesa2;
import java.util.*;
public class Sale {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            al.add(in.nextInt());
        }
        Collections.sort(al);
        int sum=0;
        for(int i=0;i<m;i++)
        {
            if((int)al.get(i)<0){
                sum=sum+(int)al.get(i);
            }
            else{
                break;
            }
        }
        System.out.println(sum*-1);
    }
}
