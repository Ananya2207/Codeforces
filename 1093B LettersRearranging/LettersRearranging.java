//package codeforcespage2;
import java.util.*;
public class LettersRearranging {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=in.nextLine();
            HashSet hs=new HashSet();
            for(int j=0;j<s.length();j++)
            {
                hs.add(s.charAt(j));
            }
            if(hs.size()==1)
            {
                System.out.println("-1");
            }
            else{
                
                
                    boolean status=isPalindrome(s);
                    if(status==false)
                    {   
                        System.out.println(s);
                       
                    }
                    else{
                        ArrayList al=new ArrayList();
                        for(int k=0;k<s.length();k++)
                        {
                            al.add(s.charAt(k));
                        }
                        Collections.sort(al);
                        for(int k=0;k<s.length();k++)
                        {
                            System.out.print(al.get(k));
                        }
                        System.out.println("");
                        
                    }
                
            }
        }
    }
    public static boolean isPalindrome(String s){
        int flag=0;
        for(int j=0,k=s.length()-1;j<s.length();j++,k--)
        {
            if(s.charAt(j)==s.charAt(k))
            {
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return false;
        }
        else{
            return true;
        }
    }
}
