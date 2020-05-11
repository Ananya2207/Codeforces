//package codeforcespage2;
import java.util.*;
public class CircleMetro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int x=in.nextInt();
        int b=in.nextInt();
        int y=in.nextInt();
        int flag=0;
        
        for(int i=a,j=b;  ;)
        {
            //System.out.println("i="+i);
            //System.out.println("j="+j);
            if(i==j)
            {flag=1;
                System.out.println("YES");
                break;
            }
            else
            {
                if(i==x)
                break;
                if(j==y)
                break;
                if(i==n)
                {
                    i=1;
                }
                else{
                i++;
                }
                if(j==1)
                {
                    j=n;
                }
                else{
                j--;
                }
            }

            
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
        
    }
}
