//package codeforcesa2;
import java.util.*;
public class Lecture {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        //in.nextLine();
        String arr[][]=new String[m][2];
        for(int i=0;i<m;i++)
        {
            arr[i][0]=in.next();
            arr[i][1]=in.next();
            in.nextLine();
        }
//        for(int i=0;i<m;i++)
//        {System.out.println("i= "+i);
//            System.out.print(arr[i][0]+" ");
//            System.out.print(arr[i][1]+" ");
//            System.out.println("");
//        }
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=in.next();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(s[i].equals(arr[j][0])){
                    if(s[i].length()<=arr[j][1].length()){
                        System.out.print(s[i]+" ");
                    }else{
                        System.out.print(arr[j][1]+" ");
                    }
                    break;
                }
            }
        }
        
        
        
    }
}
