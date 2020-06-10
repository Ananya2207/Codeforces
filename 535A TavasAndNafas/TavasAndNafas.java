//package codeforcesa3;
import java.util.*;
public class TavasAndNafas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=0 && n<=9){
            String s=getWord(n);
            System.out.println(s);
        }else if(n>=10 && n<=19){
            String s=getWords(n);
            System.out.println(s);
        }else{
            if(n%10==0){
                String s=getTens(n/10);
                System.out.println(s);
            }else{
                String s=getTens(n/10);
                String p=getWord(n%10);
                System.out.println(s+"-"+p);
            }
        }
    }
    static String getWord(int n){
        if(n==0){
            return "zero";
        }else if(n==1){
            return "one";
        }else if(n==2){
            return "two";
        }else if(n==3){
            return "three";
        }else if(n==4){
            return "four";
        }else if(n==5){
            return "five";
        }else if(n==6){
            return "six";
        }else if(n==7){
            return "seven";
        }else if(n==8){
            return "eight";
        }else{
            return "nine";
        }
    }
    static String getTens(int n){
        if(n==2){
            return "twenty";
        }else if(n==3){
            return "thirty";
        }else if(n==4){
            return "forty";
        }else if(n==5){
            return "fifty";
        }else if(n==6){
            return "sixty";
        }else if(n==7){
            return "seventy";
        }else if(n==8){
            return "eighty";
        }else{
            return "ninety";
        }
    }
    static String getWords(int n){
        if(n==10){
            return "ten";
        }else if(n==11){
            return "eleven";
        }else if(n==12){
            return "twelve";
        }else if(n==13){
            return "thirteen";
        }else if(n==14){
            return "fourteen";
        }else if(n==15){
            return "fifteen";
        }else if(n==16){
            return "sixteen";
        }else if(n==17){
            return "seventeen";
        }else if(n==18){
            return "eighteen";
        }else{
            return "nineteen";
        }
    }
}
