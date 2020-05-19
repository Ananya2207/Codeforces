//package codeforcesa1;
import java.util.*;
public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            ArrayList al=new ArrayList();
            while(n!=0)
            {
                int rem=n%10;
                al.add(rem);
                n=n/10;
            }
            //System.out.println(al);
            Collections.reverse(al);
            ArrayList aa=new ArrayList();
            
            for(int j=0;j<al.size();j++)
            {
                if((int)al.get(j)==0){
                    continue;
                }else{
                    int mul=0;
                    if((al.size()-j-1)==4)
                    {
                        mul=10000;
                    }else if((al.size()-j-1)==3)
                    {
                        mul=1000;
                    }else if((al.size()-j-1)==2)
                    {
                        mul=100;
                    }else if((al.size()-j-1)==1)
                    {
                        mul=10;
                    }else{
                        mul=1;
                    }
                    //System.out.println();
                    aa.add((int)al.get(j)*(mul));
                }
            }
            System.out.println(aa.size());
            for(int j=0;j<aa.size();j++)
            {
                System.out.print((int)aa.get(j)+" ");
            }
            System.out.println("");
            
        }
    }
}
