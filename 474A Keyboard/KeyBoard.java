//package codeforcespage2;
import java.util.*;
public class KeyBoard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String dir=in.nextLine();
        String s=in.nextLine();
        
        String line1="qwertyuiop";
        String line2="asdfghjkl;";
        String line3="zxcvbnm,./";
        String res="";
        if(dir.equals("R"))
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<line1.length();j++)
                {
                    if(s.charAt(i)==line1.charAt(j))
                    {
                        if(j==0)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line1.charAt(j-1);
                        }
                    }
                }
                for(int j=0;j<line2.length();j++)
                {
                    if(s.charAt(i)==line2.charAt(j))
                    {
                        if(j==0)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line2.charAt(j-1);
                        }
                    }
                }
                for(int j=0;j<line3.length();j++)
                {
                    if(s.charAt(i)==line3.charAt(j))
                    {
                        if(j==0)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line3.charAt(j-1);
                        }
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<line1.length();j++)
                {
                    if(s.charAt(i)==line1.charAt(j))
                    {
                        if(j==line1.length()-1)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line1.charAt(j+1);
                        }
                        
                    }
                }
                for(int j=0;j<line2.length();j++)
                {
                    if(s.charAt(i)==line2.charAt(j))
                    {
                        if(j==line2.length()-1)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line2.charAt(j+1);
                        }
                    }
                }
                for(int j=0;j<line3.length();j++)
                {
                    if(s.charAt(i)==line3.charAt(j))
                    {
                        if(j==line3.length()-1)
                        {
                            res=res+s.charAt(i);
                        }
                        else{
                            res=res+line3.charAt(j+1);
                        }
                    }
                }
            }
        }
        
        System.out.println(res);
    }
}
