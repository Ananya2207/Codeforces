//package codeforcesa;
import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String s=in.nextLine();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(s);
//        
        ArrayList al=new ArrayList();
        //ArrayList bl=new ArrayList();
        ArrayList sl=new ArrayList();
        for(int i=0;i<a.length();i++)
        {
          al.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
          al.add(b.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            sl.add(s.charAt(i));
        }
        //System.out.println(al);
        //System.out.println(sl);
        
        HashSet hs1=new HashSet();
        HashSet hs2=new HashSet();
        
        for(int i=0;i<al.size();i++)
        {
            hs1.add(al.get(i));
        }
        for(int i=0;i<sl.size();i++)
        {
            hs2.add(sl.get(i));
        }
        //System.out.println(hs1);
        //System.out.println(hs2);
        Object arr1[]=hs1.toArray();
        Object arr2[]=hs2.toArray();
//        for(int i=0;i<arr1.length;i++)
//        {
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println("");
//        for(int i=0;i<arr2.length;i++)
//        {
//            System.out.print(arr2[i]+" ");
//        }
        int count=0;
        if(hs1.size()==hs2.size() && al.size()==sl.size())
        {
            for(int i=0;i<arr1.length;i++)
            {
                if(Collections.frequency(al, arr1[i]) == Collections.frequency(sl, arr1[i]))
                {
                 count++;   
                }
                else
                {
                    System.out.println("NO");
                    break;
                }
                if(count==arr1.length)
                {
                    System.out.println("YES");
                }
            }
        }
        else
        {
            System.out.println("NO");
        }
        
        
        
    }
}
