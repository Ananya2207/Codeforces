//package codeforcesa4;
import java.util.*;
public class AsphaltingRoads {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[n];
        ArrayList al=new ArrayList();
        int cnt=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x=in.nextInt();
                int y=in.nextInt();
                if(row[x-1]==false && col[y-1]==false){
                    row[x-1]=true;
                    col[y-1]=true;
                    al.add(cnt);
                }
                cnt++;
            }
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print((int)al.get(i)+" ");
        }
        
    }
}
