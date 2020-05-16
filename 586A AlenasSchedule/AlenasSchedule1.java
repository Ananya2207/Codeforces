//package codeforcesa1;
import java.util.*;
public class AlenasSchedule1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1){
                start=i;
                break;
            }
            start=i;
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==1){
                end=i;
                break;
            }
            end=i;
        }
        //System.out.println("start="+start);
        //System.out.println("end="+end);
        if(n==1 && a[0]==0)
        {
            System.out.println("0");
        }
        else if(n==1 && a[0]==1)
        {
            System.out.println("1");
        }
        else if(start>end)
                {
                    System.out.println("0");    
                }
        else{
            int count=0;
            
            for(int i=start;i<=end;i++)
            {
                if(a[i]==1){
                    count++;
                }else{
                    if(a[i-1]==1 && a[i+1]==1)
                    {
                        count++;
                    }
                    else{
                        continue;
                    }
                }
            }
            System.out.println(count);
        }
        
    }
}
