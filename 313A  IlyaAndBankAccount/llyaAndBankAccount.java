//package codef;
import java.util.*;
public class llyaAndBankAccount {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        if(n>=0)
        {
            System.out.println(n);
        }
        else
        {
            String s=Integer.toString(n);
            if(s.length()==2)
            {
                System.out.println("0");
            }
            else
            {
                if(s.charAt(s.length()-2)>s.charAt(s.length()-1) )
                {
                    String result="";
                    for(int i=0;i<s.length();i++)
                    {
                        if(i!=s.length()-2)
                        result=result+s.charAt(i);
                    }
                    if(result.equals("-0"))
                    {
                        System.out.println("0");
                    }
                    else
                    {
                    System.out.println(result);
                    }
                    
                }
                else
                {
                    String result="";
                    for(int i=0;i<s.length()-1;i++)
                    {
                        result=result+s.charAt(i);
                    }
                    System.out.println(result);
                }
                
            }
        }
    }
}
