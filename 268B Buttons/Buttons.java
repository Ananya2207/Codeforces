//package codeforcespage2;
import java.util.*;
public class Buttons {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=n;
        for(int i=2;i<n;i++)
        {
            sum=sum+(((n-i)*i)+1);
        }
        if(n>1)
        sum++;
        
        System.out.println(sum);
    }
}
