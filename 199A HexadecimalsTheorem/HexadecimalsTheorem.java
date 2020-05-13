//package codeforcespage2;
import java.util.*;
public class HexadecimalsTheorem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[50];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<46 ;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        int n=in.nextInt();
        if(n==0)
        {
            System.out.println("0 0 0");
        }
        else if(n==1)
        {
            System.out.println("1 0 0");
        }
        else{
            int index=0;
           for(int i=3;i<46;i++)
           {
               if(n==a[i])
               {
                   index=i;
               }
           }
            System.out.println(a[index-1]+" "+a[index-2]+" "+"0");
        }
        
    }
}
