//package codeforcesa2;
import java.util.*;
public class Puzzles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<m;i++)
        {
            al.add(in.nextInt());
        }
        Collections.sort(al);
        int min=1001;
        for(int i=0;i<=m-n;i++)
        {
            int diff=(int)al.get(i+n-1)-(int)al.get(i);
            if(diff<min){
                min=diff;
            }
        }
        System.out.println(min);
    }
}
