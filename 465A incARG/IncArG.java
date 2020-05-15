//package codeforcespage2;
import java.util.*;
public class IncArG {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String one="";
        for(int i=0;i<s.length();i++)
        {
            if(i==0){
                one=one+'1';
            }else{
                one=one+'0';
            }
        }
        String res="";
        char carry=' ';
        if(n==1){
            System.out.println("1");
            return;
        }
        int flag=0;
        if(s.charAt(0)=='0'){
                System.out.println("1");
                flag=1;
                return;
        }else{
                res=res+'0';
                carry='1';
        }
        if(flag==1){
            return;
        }
        
        if(carry==' '){
                System.out.println("1");
        }
        else{
            
                for(int i=1;i<s.length();i++)
                {
                    if(s.charAt(i)=='0' && carry=='0'){
                        res=res+'0';
                        carry='0';
                    }
                    else if(s.charAt(i)=='0' && carry=='1'){
                        res=res+'1';
                        carry='0';
                    }
                    else if(s.charAt(i)=='1' && carry=='0'){
                        res=res+'1';
                        carry='0';
                    }else{
                        res=res+'0';
                        carry='1';
                        
                    }

                }
               // System.out.println(count);
               int count=0; 
               for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==res.charAt(i)){
                        continue;
                    }else{
                        count++;
                    }
                }
               //System.out.println("in");
               System.out.println(count);
        }
    }
}
