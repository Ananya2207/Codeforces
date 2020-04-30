//package codef;
import java.util.*;
public class NewYearCandles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a, b, div, rem;
        a=in.nextInt();
        b=in.nextInt();
        int sum = a;
        while(a >= b)
        {
        div = a / b;
        sum += div;
        rem = a % b;
        a = div + rem;
        }
        System.out.println(sum);
    }
}
