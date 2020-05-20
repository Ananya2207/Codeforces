//package codeforcesa1;
import java.util.*;
public class Cards {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int Z=0;
        int E=0;
        int R=0;
        int O=0;
        int N=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='z'){
                Z++;
            }else if(s.charAt(i)=='e'){
                E++;
            }else if(s.charAt(i)=='r'){
                R++;
            }else if(s.charAt(i)=='o'){
                O++;
            }else{
                N++;
            }
        }
        
        int min1=Math.min(O, N);
        int min=Math.min(E, min1);
        for(int i=0;i<min;i++)
        {
            System.out.print("1"+" ");
        }
        O=O-min;
        E=E-min;
        int min2=Math.min(O, E);
        int min3=Math.min(Z, R);
        int min4=Math.min(min2, min3);
        for(int i=0;i<min4;i++)
        {
            System.out.print("0"+" ");
        }
    }
}
