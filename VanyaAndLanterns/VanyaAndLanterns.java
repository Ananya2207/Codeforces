//package codeforcesb;
import java.util.*;
public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int diff=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
        System.out.println("");
        int max=0;
        int left=a[0];
        int right=a[a.length-1];
        
        for(int i=0;i<n-1;i++)
        {
            
            diff=a[i+1]-a[i];
            if(diff>max)
            {
                max=diff;
            }
            //System.out.print(diff+" ");
        }
        //System.out.println("max="+max);
        double x=(double)max/2;
        //System.out.println("x="+x);
        double y=left;
        double z=l-right;
        double newmax=Math.max(x, y);
        double finalmax=Math.max(newmax, z);
        System.out.format("%.10f",finalmax);
    }
}
