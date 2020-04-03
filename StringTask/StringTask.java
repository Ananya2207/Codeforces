//package codeforcesa;
import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String news=s.toLowerCase();
        //System.out.println(news);
        String consonant="";
        for(int i=0;i<news.length();i++)
        {
            if(news.charAt(i)=='a' || news.charAt(i)=='e' || news.charAt(i)=='i' || news.charAt(i)=='o' || news.charAt(i)=='u' || news.charAt(i)=='y')
            {
                
            }
            else
            {
                consonant=consonant+news.charAt(i);
            }
        }
        //System.out.println("consonant="+consonant);
        String result="";
        int count=1;
        for(int i=0;i<2*consonant.length();i++)
        {
            if(i%2==0)
            {
                result=result+'.';
            }
            else
            {
                result=result+consonant.charAt(i-count);
                count++;
            }
        }
        System.out.println(result);
    }
}
