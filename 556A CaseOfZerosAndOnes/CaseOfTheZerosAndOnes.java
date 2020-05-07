//package codeforcespage2;
import java.util.*;
public class CaseOfTheZerosAndOnes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int c=0,d=0;
        for(int b=0; b<n; b++) {
            if(s.charAt(b)=='1') 
            {
                c++;
            }
            else 
                {d++;
            }
        }


        if(c>d)
        {
            System.out.println(c-d);
        }
        else
        {
            System.out.println(d-c);
        }
    }

}
