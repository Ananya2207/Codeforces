//package codeforcespage2;
import java.util.*;
public class Romaji {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int flag=0;
        //System.out.println(s);
        for(int i=0;i<s.length()-1;i++)
        {
            boolean x=isConsonant(s.charAt(i));
            if(x==true)
            {
                if(s.charAt(i+1)=='a' || s.charAt(i+1)=='e' || s.charAt(i+1)=='i' || s.charAt(i+1)=='o' || s.charAt(i+1)=='u')
                {
                    continue;
                }
                else
                {flag=1;
                    System.out.println("NO");
                    break;
                }
            }
        }
        if(flag==0)
        {
            if(isConsonant(s.charAt(s.length()-1))==false)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
    }
    public static boolean isConsonant(char x)
    {
        
        if(x=='b' || x=='c' || x=='d' || x=='f' || x=='g' || x=='h' || x=='j' || x=='k' || x=='l' || x=='m' || x=='p' || x=='q' || x=='r' || x=='s' || x=='t'|| x=='v'|| x=='w' || x=='x' || x=='y'|| x=='z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
