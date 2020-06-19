//package codeforcesa4;
import java.util.*;
public class MaximAndBiology {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String gen="ACTG";
        int index=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length()-3;i++)
        {index=0;
         sum=0;
            for(int j=i;j<i+4;j++)
            {
                int x=s.charAt(j);
                int y=gen.charAt(index);
                int p=Math.abs(x-y);
                int q=26-Math.abs(x-y);
                sum+=Math.min(p, q);
                
                index++;
            }
            if(sum<ans){
                ans=sum;
            }
        }
        System.out.println(ans);
    }
}
