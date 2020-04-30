//package codef;
import java.util.*;
public class ChoosingTeam {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]+k<=5)
            {
               count++; 
            }
        }
        System.out.println(count/3);
    }
}
