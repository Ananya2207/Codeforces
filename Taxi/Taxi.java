//package codeforcesb;
import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int count=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==4)
            {
             four++;   
            }
            else if(a[i]==3)
            {
                three++;
            }    
            else if(a[i]==2)
            {
                two++;
            }
            else
            {
                one++;
            }
        }
        
        count=count+four;
        //System.out.println("three="+three);
        //System.out.println("two="+two);
        //System.out.println("one="+one);
        
        int remthree=0;
        int remone=0;
        int flag=0;
        if(three==one)
        {flag=1;
            count=count+three;
           
        }
        else if(three>one)
        {flag=1;
            count=count+one;
            remthree=three-one;
            
        }
        else
        {flag=1;
            count=count+three;
            remone=one-three;
        }
        count=count+remthree;
        
        int rem=0;
        if(flag==0)
        {
            remone=one;
        }
        
        if(two%2==0)
        {
            count=count+(two/2);
        }
        else
        {
            //remone=remone-remone;
            rem=(two*2)+remone;
            if(rem%4==0)
            {
                count=count+(rem/4);
            }
            else
            {
                count=count+(rem/4)+1;
            }
            remone=remone-remone;
        }
        if(remone!=0)
        {
            if(remone%4==0)
            count=count+(remone/4);
            else
                count=count+(remone/4)+1;
        }
        System.out.println(count);
    }
}
