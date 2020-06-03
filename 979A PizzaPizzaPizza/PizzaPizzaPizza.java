//package codeforcesa3;
import java.util.*;
public class PizzaPizzaPizza {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        n++;
        //long angle=360/n;
        if(n==1){
            System.out.println("0");
        }else{
            if(n%2==0){
                System.out.println(n/2);
            }else{
                System.out.println(n);
            }
        }
        
    }
}

