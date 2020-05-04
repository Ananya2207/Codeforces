//package codef;
import java.util.*;
public class TwoButtons {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
	while (n != m)
        {
            if (m > n)
            {
                    if (m % 2 == 0)
                    {
                        m /= 2;
                        count++;
                    }
                    else
                    {
                        m++;
                        count++;
                    }
            }
            else
            {
                     m++;
                     count++;
            }
        }
  	
        System.out.println(count);
        
    }
}
