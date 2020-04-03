//package codeforcesa;
import java.util.*;
public class Bit__ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String a[]=new String[n+1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextLine();
            
        }
//        for(int i=0;i<a.length+1;i++)
//        {//System.out.println("i="+i);
//            System.out.println(a[i]);
//        }
        
        int count=0;
        for(int i=0;i<a.length;i++)
        {       if(i==0)
                continue;
            
            //System.out.println("i="+i);
            if(a[i].equals("X++") || a[i].equals("++X"))
            {
                //System.out.println("inside");
                 count++;
            }
            else{
                count--;
            }
        }
        System.out.println(count);
        
    }
}
