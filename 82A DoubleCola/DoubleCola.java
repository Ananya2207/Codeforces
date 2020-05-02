//package codeforcesa;
import java.util.*;
public class DoubleCola {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long sum=0;
        long pre=0;
        int flag=0;
        
        if(n<=5)
        {
            flag=1;
            if(n==1)
            {
                System.out.println("Sheldon");
            }
            else if(n==2)
            {
                System.out.println("Leonard");
            }
            else if(n==3)
            {
                System.out.println("Penny");
            }
            else if(n==4)
            {
                System.out.println("Rajesh");
            }
            else
            {
                System.out.println("Howard");
            }
        }
        
        
        for(int i=5; sum<n ;i=i*2)
        {
            pre=sum;
            sum=sum+i;
            //System.out.println("sum="+sum);
        }
        //System.out.println("pre="+pre);
        //System.out.println("sum="+sum);
        
        long diff=sum-pre;
        long inc=diff/5;
        
        long find=n-pre;
        //System.out.println("find="+find);
        
        for(int i=0;i<5;i++)
        {
            if(flag==0)
            if(i==(find/inc))
            {
                if(i==0)
                {
                    System.out.println("Sheldon");
                }
                else if(i==1)
                {
                    System.out.println("Leonard");
                }
                else if(i==2)
                {
                    System.out.println("Penny");
                }
                else if(i==3)
                {
                    System.out.println("Rajesh");
                }
                else
                {
                    System.out.println("Howard");
                }
            }
        }
    }
}
