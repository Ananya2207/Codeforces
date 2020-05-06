//package codeforcespage2;
import java.util.*;
public class Dragons {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[n][2];
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
            al.add(a[i][0]);
        }
        
        Collections.sort(al);
        //System.out.println(al);
        int flag=0;
        int b[][]=new int[n][2];
        for(int i=0;i<al.size();i++)
        {
            int item=(int)al.get(i);
            int val=search(item,a);
            //System.out.println("item="+item+" val="+val);
            if(s>item)
            {
                s=s+val;
            }
            else
            {flag=1;
                System.out.println("NO");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("YES");
        }
        
    }
    static int flag[]=new int[10000];
    public static int search(int key,int a[][])
    {
        
//        System.out.println("flag array");
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(flag[i]+" ");
//        }
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i][0] && flag[i]==0)
            {//System.out.println("in i="+i);
                flag[i]=1;
                ans=a[i][1];
                break;
            }
        }
        return ans;
    }
}
















//HashMap<Integer,Integer> hm=new HashMap<Integer,Integer> ();
//        for(int i=0;i<n;i++)
//        {
//            int key=in.nextInt();
//            int value=in.nextInt();
//            hm.put(key, value); 
//        }
//        System.out.println(hm);
//        Map<Integer,Integer> tm=new TreeMap<Integer,Integer> (hm);
//        System.out.println(tm);
//        
//        Set set2 = tm.entrySet();
//        Iterator iterator2 = set2.iterator();
//        int flag=0;
//        while(iterator2.hasNext()) {
//              Map.Entry me2 = (Map.Entry)iterator2.next();
//              if((int)me2.getKey()< s)
//              {System.out.println("s="+s);
//                  int k=(int)me2.getKey();
//                  s=s+k;
//                  System.out.println("s="+s);
//              }
//              else{
//                  flag=1;
//                  System.out.println("No");
//                  break;
//              }
//         }
//        if(flag==0)
//        {
//            System.out.println("YES");
//        }
