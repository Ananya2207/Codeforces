//package codeforcesa4;
import java.util.*;
public class Remaindar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int z=s.length()-y-1;
        int ans=0;
        //System.out.println("z="+z);
        for(int i=s.length()-1;i>=s.length()-x;i--)
        {
            if(i==z){
                if(s.charAt(i)=='0'){
                    ans++;
                }
            }else{
                if(s.charAt(i)=='1'){
                    //System.out.println("i="+i);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
