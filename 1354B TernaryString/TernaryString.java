//package codeforcesa1;
import java.util.*;
public class TernaryString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        
        for(int i=0;i<t;i++)
        {
            String s=in.nextLine();
            ArrayList<String> al=new ArrayList<String> ();
            
            for(int j=0;j<s.length()-2;j++)
            {
                if(s.charAt(j+1)!=s.charAt(j)){
                    int index3=j+2;
                    
                    while(index3<s.length()){
                        if(s.charAt(index3)==s.charAt(j+1))
                        {
                            index3++;
                            continue;
                        }else if(s.charAt(index3)!=s.charAt(j) && s.charAt(index3)!=s.charAt(j+1)){
                            String found=s.substring(j, index3+1);
                            al.add(found);
                            break;
                        }else{
                            break;
                        }
                    }
                }
            }
            if(al.size()==0)
            {
                System.out.println("0");
            }
            else{
                int minsize=200000;
                for(int j=0;j<al.size();j++)
                {
                    String xxx=al.get(j);
                    if(xxx.length()<minsize){
                        minsize=xxx.length();
                    }
                }
                System.out.println(minsize);
            }
        }
    }
}
