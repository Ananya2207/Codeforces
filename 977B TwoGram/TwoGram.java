//package codeforcesa2;
import java.util.*;
public class TwoGram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        ArrayList al=new ArrayList();
        HashSet hs=new HashSet();
        for(int i=0;i<s.length()-1;i++)
        {
            String sub=s.substring(i, i+2);
            al.add(sub);
            hs.add(sub);
        }
        Object arr[]=hs.toArray();
        int fre[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            fre[i]=Collections.frequency(al, arr[i]);
        }
        int max=0;
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            if(fre[i]>max){
                max=fre[i];
                res="";
                res=(String)arr[i];
            }
        }
        System.out.println(res);
    }
}
