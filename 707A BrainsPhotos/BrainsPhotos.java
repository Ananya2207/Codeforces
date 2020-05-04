//package codef;
import java.util.*;
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s[]=new String[n];
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            s[i]=in.nextLine();
        }
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<s[i].length();j++)
//            {
//                System.out.print(s[i].charAt(j));
//            }
//            System.out.println("");
//            //System.out.println(s[i].length());
//        }
        
        
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)=='C' || s[i].charAt(j)=='M' || s[i].charAt(j)=='Y')
                {
                    flag=1;
                    System.out.println("#Color");
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("#Black&White");
        }
    }
}
