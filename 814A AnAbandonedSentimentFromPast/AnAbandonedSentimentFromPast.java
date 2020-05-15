//package codeforcespage2;
import java.util.*;
public class AnAbandonedSentimentFromPast {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[k];
        ArrayList al=new ArrayList();
        ArrayList bl=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            al.add(a[i]);
        }
        for(int i=0;i<k;i++)
        {
            b[i]=in.nextInt();
            bl.add(b[i]);
        }
        Collections.sort(bl);
        int index=bl.size()-1;
        for(int i=0;i<n;i++)
        {
            if((int)al.get(i)==0){
                al.set(i, bl.get(index));
            }
        }
        int flag=0;
        for(int i=0;i<al.size()-1;i++)
        {
            if((int)al.get(i)<(int)al.get(i+1)){
                continue;
            }else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
        
    }
}
