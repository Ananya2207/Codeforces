//package codeforcesa2;
import java.util.*;
public class SecondPriceAuction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al=new ArrayList();
        int max=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
            int x=in.nextInt();
            al.add(x);
            if(x>max){
                max=x;
                index=i+1;
            }
        }
        Collections.sort(al);
        int ele=(int)al.get(al.size()-2);
        System.out.println(index+" "+ele);
    }
}
