//package codeforcesa3;
import java.util.*;
public class DrinksChoosing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        int fre[]=new int[k+1];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            fre[a[i]]++;
        }
        int oddfrecount=0;
        for(int i=0;i<k+1;i++)
        {
            if(fre[i]%2==1){
                oddfrecount++;
            }
        }
        System.out.println(n-oddfrecount/2);
        
    }
}

