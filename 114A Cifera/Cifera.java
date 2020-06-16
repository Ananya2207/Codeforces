//package codeforcesa4;
import java.util.*;
public class Cifera {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int l=in.nextInt();
        int count=0;
        while(l>k){
            if(l%k==0){
                l=l/k;
                count++;
            }else{
                break;
            }
            
        }
        if(l==k){
            System.out.println("YES");
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
    }
}
