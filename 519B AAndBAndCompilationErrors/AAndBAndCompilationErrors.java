//package codeforcespage2;
import  java.util.*;
public class AAndBAndCompilationErrors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        ArrayList a3=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a1.add(in.nextInt());
        }
        for(int i=0;i<n-1;i++)
        {
            a2.add(in.nextInt());
        }
        for(int i=0;i<n-2;i++)
        {
            a3.add(in.nextInt());
        }
        Collections.sort(a1);
        Collections.sort(a2);
        Collections.sort(a3);
        //System.out.println(a1);
        //System.out.println(a2);
        //System.out.println(a3);
        int flag1=0;
        int flag2=0;
        
        for(int i=0;i<a2.size();i++)
        {
            int a=(int)a1.get(i);
            int b=(int)a2.get(i);
            if(a==b)
            {//System.out.println("i="+i);
                continue;
            }
            else
            {//System.out.println("i="+i);
                flag1=1;
                System.out.println(a1.get(i));
                break;
            }
        }
        if(flag1==0)
            System.out.println(a1.get(a1.size()-1));
        for(int i=0;i<a3.size();i++)
        {   int a=(int)a2.get(i);
            int b=(int)a3.get(i);
            
            if(a==b)
            {
                continue;
            }
            else
            {//System.out.println("in");
                flag2=1;
                System.out.println(a2.get(i));
                break;
            }
        }
        if(flag2==0)
            System.out.println(a2.get(a2.size()-1));
        
    }
}
