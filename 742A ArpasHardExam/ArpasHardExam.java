//package codeforcesa3;
import java.math.BigInteger;
import java.util.*;
public class ArpasHardExam {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==0){
            System.out.println("1");
        }else{
            if(n%4==0){
                System.out.println("6");
            }else if(n%4==1){
                System.out.println("8");
            }else if(n%4==2){
                System.out.println("4");
            }else{
                System.out.println("2");
            }
        }
    }
}
