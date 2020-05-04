//package codef;
import java.util.*;
public class BersuBall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al1=new ArrayList();
        for(int i=0;i<n;i++)
        {
            al1.add(in.nextInt());
        }
        int m=in.nextInt();
        ArrayList al2=new ArrayList();
        for(int i=0;i<m;i++)
        {
            al2.add(in.nextInt());
        }
        //System.out.println(al1);
        //System.out.println(al2);
        Collections.sort(al1);
        Collections.sort(al2);
        int count=0;
        
            for(int i=0;i<al1.size();i++)
            {//System.out.println("in");
                
                if((int)al1.get(i)==1)
                {
                    for(int j=0;j<al2.size();j++)
                    {
                        if((int)al2.get(j)==1 || (int)al2.get(j)==2)
                        {//System.out.println("in 1");
                            count++;
                            al2.remove(j);
                            break;
                        }
                    }
                }
                else{
                    for(int j=0;j<al2.size();j++)
                    {
                        int pre=(int) al1.get(i) -1;
                        int next=(int) al1.get(i) +1;
                        if((int)al2.get(j)==pre || al2.get(j)==al1.get(i) || (int)al2.get(j)==next)
                        {//System.out.println("in");
                            count++;
                            al2.remove(j);
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        
    }
}
