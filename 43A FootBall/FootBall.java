//package codeforcesa2;
import java.util.*;
public class FootBall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        ArrayList al=new ArrayList();
        HashSet hs=new HashSet();
        for(int i=0;i<n;i++){
            String s=in.nextLine();
            al.add(s);
            hs.add(s);
        }
        Object arr[]=hs.toArray();
        int fre[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            fre[i]=Collections.frequency(al, arr[i]);
        }
        if(hs.size()==1){
            System.out.println(arr[0]);
        }else{
            if(fre[0]>fre[1]){
                System.out.println(arr[0]);
            }else{
                System.out.println(arr[1]);
            }
        }
    }
}
