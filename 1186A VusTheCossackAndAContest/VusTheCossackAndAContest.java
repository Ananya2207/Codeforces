//package codeforcesa1;
import java.util.*;
public class VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        if(m>=n && k>=n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
