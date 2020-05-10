//package codeforcespage2;
import java.util.*;
public class DoggoRecoloring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        if(n==1)
        {
            System.out.println("YES");
            return;
        }
        ArrayList al=new ArrayList();
        for(int i=0;i<s.length();i++)
        {
            al.add(s.charAt(i));
        }
        int flag=0;
        Collections.sort(al);
        for(int i=0;i<al.size()-1;i++)
        {
            if(al.get(i)==al.get(i+1))
            {flag=1;
                System.out.println("YES");
                break;
            }
        }
        if(flag==0)
        {System.out.println("NO");}
    }
}
