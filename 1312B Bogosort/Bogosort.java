//package codeforcesa2;
import java.util.*;
public class Bogosort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            ArrayList al=new ArrayList();
            for(int j=0;j<n;j++)
            {
                al.add(in.nextInt());
            }
            Collections.sort(al,Collections.reverseOrder());
            for(int j=0;j<al.size();j++)
            {
                System.out.print(al.get(j)+" ");
            }
            System.out.println("");
        }
    }
}
