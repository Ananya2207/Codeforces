//package codeforcesa2;
import java.util.*;
public class DetermineLine {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al=new ArrayList();
        HashSet hs=new HashSet();
        for(int i=0;i<n;i++)
        {
            int r=in.nextInt();
            for(int j=0;j<r;j++)
            {
                int x=in.nextInt();
                al.add(x);
                hs.add(x);
            }
            Object arr[]=hs.toArray();
            for(int j=0;j<arr.length;j++)
            {
                int fre=Collections.frequency(al, arr[j]);
                if(fre==n){
                    System.out.print(arr[j]+" ");
                }
            }
        }
        
        
    }
}
