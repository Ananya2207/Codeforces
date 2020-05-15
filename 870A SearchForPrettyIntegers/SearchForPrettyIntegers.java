//package codeforcespage2;
import java.util.*;
public class SearchForPrettyIntegers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList al1=new ArrayList();
        ArrayList al2=new ArrayList();
        ArrayList merge=new ArrayList();

        for(int i=0;i<n;i++)
        {
            al1.add(in.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            al2.add(in.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            merge.add(al1.get(i));
        }
        for(int i=0;i<m;i++)
        {
            merge.add(al2.get(i));
        }
        Collections.sort(merge);
        HashSet hs=new HashSet();
        int flag=0;
        for(int i=0;i<merge.size();i++)
        {
            if(hs.add(merge.get(i))==false)
            {
                flag=1;
                System.out.println(merge.get(i));
                break;
            }
        }
        if(flag==0){
            Collections.sort(al1);
            Collections.sort(al2);
                
            if((int)al1.get(0)<=(int)al2.get(0)){
                System.out.println(al1.get(0)+""+al2.get(0));
            }else{
                System.out.println(al2.get(0)+""+al1.get(0));
            }
        }
    }
}
