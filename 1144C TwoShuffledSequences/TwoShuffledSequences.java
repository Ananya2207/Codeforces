//package hackerrank1;
import java.util.*;
public class TwoShuffledSequences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1]){
                a1.add(a[i]);
                a2.add(a[i+1]);
                
                if(i+2<n && a[i+2]==a[i]){
                    System.out.println("NO");flag=1;
                    break;
                }
                i++;
            }else{
                a1.add(a[i]);
            }
        }
        
        
        if(flag==0){
            if(n-1>0){
            if(a[n-1]==a[n-2]){
                //a2.add(a[n-1]);
            }else{
                a1.add(a[n-1]);
            }
            }else{
                a1.add(a[n-1]);
            }
            
            System.out.println("YES");
            System.out.println(a1.size());
            for(int i=0;i<a1.size();i++){
                System.out.print(a1.get(i)+" ");
            }
            System.out.println("");
            System.out.println(a2.size());
            for(int i=a2.size()-1;i>=0;i--){
                System.out.print(a2.get(i)+" ");
            }
            System.out.println("");
        }
        
    }
}

