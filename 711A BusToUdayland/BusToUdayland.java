//package codef;
import java.util.*;
public class BusToUdayland {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s[]=new String[n];
        char a[][]=new char[n][5];
        for(int i=0;i<n;i++)
        {
            s[i]=in.nextLine();
        }
        int row=0;
        int col=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(s[i].charAt(0)=='O' && s[i].charAt(1)=='O')
            {flag=1;
                row=i;
                col=0;
                System.out.println("YES");
                break;
            }
            if(s[i].charAt(3)=='O' && s[i].charAt(4)=='O')
            {flag=1;
                row=i;
                col=3;
                System.out.println("YES");
                break;
            }
        }
        //System.out.println("row="+row);
        //System.out.println("col="+col);
        
        if(flag==0)
        {
            System.out.println("NO");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<s[i].length();j++)
                {
                    if(i==row && col==j)
                    {//System.out.println("in");
                        a[i][j]='+';
                        a[i][j+1]='+';
                        j++;
                    }
                    else
                    {
                        a[i][j]=s[i].charAt(j);
                    }
                            
                }
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<s[i].length();j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println("");
            }
            
        }
        
        
        
    }
}
