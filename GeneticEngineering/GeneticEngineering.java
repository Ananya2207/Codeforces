//package codeforces;
import java.util.*;
public class GeneticEngineering {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=1;
        int insert=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                if(count%2==0)
                {
                    insert++;
                }
                count=1;
            }
        }
        if(count%2==0)
            insert++;
        System.out.println(insert);
    }
}
