//package codeforcespage2;
import java.util.*;
public class Stages {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        ArrayList al=new ArrayList();
        for(int i=0;i<s.length();i++)
        {
            al.add(s.charAt(i));
        }
        Collections.sort(al);
        //System.out.println(al);
        
        char c=(char) al.get(0);
        int count=(int)c -96;
        ArrayList newal=new ArrayList();
        newal.add(al.get(0));
        
        //System.out.println("count="+count);
        k--;
        if(k==0)
        {
            char x=(char) al.get(0);
            int count1=(int)c -96;
            System.out.println(count1);
            return;
        }
        for(int i=1;i<al.size();i++)
        {   //System.out.println("in");   
            char a=(char) al.get(i);
            char b=(char) newal.get(newal.size()-1);
            if((int)a > (int)b + 1)
            {
                count=count+((int)a - 96);
                //System.out.println("count="+count);
                newal.add(al.get(i));
                k--;
                if(k==0){
                    break;
                }
            }
        }
        if(k==0)
        {
            System.out.println(count);
        }else{
            System.out.println("-1");
        }
    }
}
