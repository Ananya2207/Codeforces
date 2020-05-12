//package codeforcespage2;
import java.util.*;
public class RadioStation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String ser[]=new String[n];
        String comm[]=new String[m];
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            ser[i]=in.nextLine();
        }
        for(int i=0;i<m;i++)
        {
            comm[i]=in.nextLine();
        }
        HashMap<String,String> hm=new HashMap<String,String> ();
        
        for(int i=0;i<n;i++)
        {String key="";
         String value="";
         int space=0;
            for(int j=0;j<ser[i].length();j++)
            {
                if(ser[i].charAt(j)==' ')
                {
                    space=j;
                    break;
                }
            }
            key=ser[i].substring(space+1, ser[i].length());
            value=ser[i].substring(0, space);
            hm.put(key, value);
        }
        
        for(int i=0;i<m;i++)
        {int start=0;int end=0;
            for(int j=0;j<comm[i].length();j++)
            {
                if(comm[i].charAt(j)==' ')
                {
                    start=j+1;
                }
                if(comm[i].charAt(j)==';')
                {
                    end=j;
                }
            }
            String ip=comm[i].substring(start, end);
            //System.out.println("ip="+ip);
            String server=hm.get(ip);
            System.out.println(comm[i]+" #"+server);
        }
        
    }
}
