//package codeforcesa1;
import java.util.*;
public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList al=new ArrayList();
        for(int i=0;i<4;i++)
        {
            al.add(in.nextInt());
        }
        Collections.sort(al);
        System.out.println((int)al.get(3)-(int)al.get(0));
        System.out.println((int)al.get(3)-(int)al.get(1));
        System.out.println((int)al.get(3)-(int)al.get(2));
        
    }
}
