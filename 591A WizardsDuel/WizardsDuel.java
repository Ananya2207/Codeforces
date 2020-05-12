//package codeforcespage2;
import java.util.*;
public class WizardsDuel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double l=in.nextDouble();
        in.nextLine();
        double p=in.nextDouble();
        in.nextLine();
        double q=in.nextDouble();
        double ans=(l/(p+q))*p;
        if(ans-Math.floor(ans) == 0)
        {
            System.out.println((int)ans);
        }
        else{
            System.out.println(ans);
        }
        
    }
}
