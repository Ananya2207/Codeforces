//package codeforcesa2;
import java.util.*;
public class SpykeTalks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al=new ArrayList();
        HashSet hs=new HashSet();
        for(int i=0;i<n;i++)
        {
            int x=in.nextInt();
            al.add(x);
            hs.add(x);
        }
        Object arr[]=hs.toArray();
        int count=0;
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            int fre=Collections.frequency(al, arr[i]);
            if((int)arr[i]==0){
                continue;
            }
            if(fre==2){
                count++;
            }
            if(fre>2){
                flag=1;
                System.out.println("-1");
                break;
            }
        }
        if(flag==0){
            System.out.println(count);
        }
    }
}
