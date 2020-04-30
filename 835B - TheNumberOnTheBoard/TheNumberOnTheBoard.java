//package codef;
import java.math.BigInteger;
import java.util.*;
public class TheNumberOnTheBoard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        in.nextLine();
        String n=in.nextLine();
        int sum=0;
        //System.out.println(n);
        for(int i=0;i<n.length();i++)
        {
            int digit=(int)n.charAt(i);
            //System.out.println("digit="+digit);
            for(int j=48;j<58;j++)
            {
                if(digit==j)
                {
                    digit=digit-48;
                    break;
                }
            }
            sum=sum+digit;
        }
        //System.out.println("sum="+sum);
        
        if(sum>=k)
        {
            System.out.println("0");
        }
        else
        {
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<n.length();i++)
            {
                int p=(int)n.charAt(i);
                for(int j=48;j<58;j++)
                {
                    if(p==j)
                    {
                        p=p-48;
                    }
                }
                al.add(p);
            }
            Collections.sort(al);
            
            
            int count=0;
                for(int i=0;i<al.size();i++)
                {count++;

                    
                    sum=sum+9-al.get(i);
                    if(sum>=k)
                    {
                        break;
                    }
                }
            System.out.println(count);
        }
        
        
    }
}
