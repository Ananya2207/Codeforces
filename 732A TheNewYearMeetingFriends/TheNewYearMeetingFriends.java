//package codeforcesa1;
import java.util.*;
public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int x2=in.nextInt();
        int x3=in.nextInt();
        ArrayList al=new ArrayList();
        al.add(x1);al.add(x2);al.add(x3);
        Collections.sort(al);
        System.out.println((int)al.get(2)-(int)al.get(0));
    }
}
