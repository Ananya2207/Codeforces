//package codeforcesa2;
import java.util.*;
public class ChipsMoving {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        if(even>odd){
            System.out.println(odd);
        }else{
            System.out.println(even);
        }
        
    }
}
