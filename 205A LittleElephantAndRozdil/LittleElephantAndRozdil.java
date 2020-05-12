//package codeforcespage2;
import java.util.*;
public class LittleElephantAndRozdil {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            al.add(in.nextInt());
        }
        ArrayList pre=new ArrayList(al);
        //System.out.println(al);
        Collections.sort(al);
        //System.out.println(al);
        
        Object first=al.get(0);
        
        int fre=Collections.frequency(al, first);
        //System.out.println("fre="+fre);
        if(fre==1)
        {
            for(int i=0;i<pre.size();i++)
            {
                if(first==pre.get(i))
                {
                    System.out.println(i+1);
                    return;
                }
            }
        }
        else
        {
            System.out.println("Still Rozdil");
        }
    }
}
