//package codeforcesa2;
import java.util.*;
public class YearOfUniversityEntrance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            al.add(in.nextInt());
        }
        Collections.sort(al);
        System.out.println((int)al.get(al.size()/2));
    }
}
