//package codeforcesa4;
import java.util.*;
public class CrosswordSolving {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String t=in.nextLine();
        int count=0;
        int ind=0;
        int max=0;
        ArrayList al=new ArrayList();
        int flag=0;
        for(int i=0;i<=t.length()-s.length();i++)
        {   count=0;
            ind=0;
            ArrayList a=new ArrayList();
            for(int j=i;j<i+s.length();j++)
            {
                if(t.charAt(j)==s.charAt(ind)){
                    count++;
                }else{
                    a.add(ind+1);
                }
                ind++;
            }
            if(flag==0){
                al.addAll(a);
                flag=1;
            }
            if(count>max){
                max=count;
                al.clear();
                al.addAll(a);
            }
        }
        System.out.println(s.length()-max);
        
        for(int i=0;i<al.size();i++)
        {
            System.out.print((int)al.get(i)+" ");
        }
    }
}
