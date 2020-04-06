//package codeforcesc;
import java.util.*;
public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s[]=new String[n];
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            s[i]=in.nextLine();
        }
        HashSet hs=new HashSet();
        HashMap<String,Integer> hm=new HashMap<String,Integer> ();
        
        for(int i=0;i<n;i++)
        {
            if(hs.add(s[i])==true)
            {
                System.out.println("OK");
            }
            else
            {
                if(hm.containsKey(s[i]))
                {
                   int count=hm.get(s[i]);
                    System.out.println(s[i]+""+(++count));
                   hm.replace(s[i], count);
                   
                }
                else
                {
                    hm.put(s[i], 1);
                    System.out.println(s[i]+"1");
                }
                        
            }
        }
        
        
    }
}
