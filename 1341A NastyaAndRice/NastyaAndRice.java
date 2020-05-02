//package codef;
import java.util.*;
public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            int mintotal=c-d;
            int maxtotal=c+d;
            int min_w=(a-b)*n;
            int max_w=(a+b)*n;
            
            if(min_w > maxtotal || max_w<mintotal)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}
          
