//package codeforcesa2;
import java.util.*;
public class LittleArtem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    if(j==0 && k==0){
                        System.out.print("W");
                    }else{
                        System.out.print("B");
                    }
                }
                System.out.println("");
            }
        }
    }
}
