//package codeforcespage2;
import java.util.*;
public class ASerialKiller {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String initial1=in.next();
        String initial2=in.next();
        int n=in.nextInt();
        in.nextLine();
        String mur[]=new String[n];
        String rep[]=new String[n];
        for(int i=0;i<n;i++)
        {
            mur[i]=in.next();
            rep[i]=in.next();
            in.nextLine();
        }
        
        ArrayList<String> al=new ArrayList<String>();
        al.add(initial1);
        al.add(initial2);
        System.out.println(al.get(0)+" "+al.get(1));
        for(int i=0;i<n;i++)
        {
            if(mur[i].equals(al.get(0))){
                al.set(0, rep[i]);
            }else{
                al.set(1, rep[i]);
            }
            System.out.println(al.get(0)+" "+al.get(1));
        }
        
        
        
        
    }
}
