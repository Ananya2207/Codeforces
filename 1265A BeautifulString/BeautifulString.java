//package codeforcesa3;
import java.util.*;
public class BeautifulString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=in.nextLine();
            String res="";
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='?'){
                    if(j==0){
                        if(j+1<s.length()){
                            boolean a=false;boolean b=false;boolean c=false;
                            char x=s.charAt(j+1);
                            if(x=='a')a=true;
                            else if(x=='b')b=true;
                            else c=true;
                            if(a==false){
                                res=res+'a';
                            }else if(b==false){
                                res=res+'b';
                            }else if(c==false){
                                res=res+'c';
                            }else{
                                res=res+'a';
                            }
                        }else{
                            res=res+'a';
                        }
                    }else if(j==s.length()-1){
                            boolean a=false;boolean b=false;boolean c=false;
                            char x=res.charAt(j-1);
                            if(x=='a')a=true;
                            else if(x=='b')b=true;
                            else c=true;
                            if(a==false){
                                res=res+'a';
                            }else if(b==false){
                                res=res+'b';
                            }else{
                                res=res+'c';
                            }
                    }else if(s.charAt(j+1)=='?'){
                        boolean a=false;boolean b=false;boolean c=false;
                            char x=res.charAt(j-1);
                            if(x=='a')a=true;
                            else if(x=='b')b=true;
                            else c=true;
                            if(a==false){
                                res=res+'a';
                            }else if(b==false){
                                res=res+'b';
                            }else{
                                res=res+'c';
                            }
                    }else{
                            boolean a=false;boolean b=false;boolean c=false;
                            char x=res.charAt(j-1);
                            char y=s.charAt(j+1);
                            if(x=='a' || y=='a')a=true;
                            if(x=='b' || y=='b')b=true;
                            if(x=='c' || y=='c')c=true;if(a==false){
                                res=res+'a';
                            }else if(b==false){
                                res=res+'b';
                            }else{
                                res=res+'c';
                            }
                    }
                }else{
                    res=res+s.charAt(j);
                }
            }
            int flag=0;
            for(int j=0;j<res.length()-1;j++)
            {
                if(res.charAt(j)==res.charAt(j+1)){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("-1");
            }else{
                System.out.println(res);
            }
        }
        
        
    }
}
