//package codeforcesa3;
import java.util.*;
public class FairGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        HashSet hs=new HashSet();
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            hs.add(a[i]);
            al.add(a[i]);
        }
        if(hs.size()==2){
            Object arr[]=hs.toArray();
            if(Collections.frequency(al, arr[0])==Collections.frequency(al, arr[1])){
                System.out.println("YES");
                System.out.println(arr[0]+" "+arr[1]);
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
        
        
    }
}
