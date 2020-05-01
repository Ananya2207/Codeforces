//package codef;
import java.util.*;
public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count1=0;
        int count2=0;
        int count3=0;
        ArrayList al1=new ArrayList();
        ArrayList al2=new ArrayList();
        ArrayList al3=new ArrayList();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count1++;
                al1.add(i+1);
            }
            else if(arr[i]==2)
            {
                count2++;
                al2.add(i+1);
            }
            else
            {
                count3++;
                al3.add(i+1);
            }
        }
        
        int min1=Math.min(count1, count2);
        int min=Math.min(min1, count3);
        System.out.println(min);
        for(int i=0;i<min;i++)
        {
            System.out.println(al1.get(i)+" "+al2.get(i)+" "+al3.get(i));
        }
    }
}
