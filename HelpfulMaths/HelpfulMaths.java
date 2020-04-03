//package codeforcesa;
import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int one=0,two=0,three=0;
        for(int i=0;i<s.length();i=i+2)
        {
            int num=Integer.parseInt(s.substring(i, i+1));
            if(num==1)
            {
                one++;
            }
            else if(num==2)
            {
                two++;
            }
            else
            {three++;
            
            }
            
        }
        String res="";
        
            while(one!=0)
            {
                res=res+'1';
                res=res+'+';
                one--;
            }
            while(two!=0)
            {
                res=res+'2';
                res=res+'+';
                two--;
            }
            while(three!=0)
            {
                res=res+'3';
                res=res+'+';
                three--;
            }
          for(int i=0;i<res.length()-1;i++)
          {
              System.out.print(res.charAt(i));
          }
            
            
        
        //System.out.println(one+" "+two+" "+three);
    }
}
