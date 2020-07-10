//package codeforcesa4;
import java.util.*;
import java.io.*;
public class SongsCompression {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    public static void main(String[] args) {
        //Scanner in=new Scanner(System.in);
        FastReader in=new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        long sum=0;
        long csum=0;
        long c[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            sum+=a[i];
            c[i]=a[i]-b[i];
            csum+=c[i];
        }
        long ans=0;
        int flag=0;
        shuffleArray(c);
        Arrays.sort(c);
        for(int i=c.length-1; i>=0; i--)
        {
            if(sum<=m){
                flag=1;
                break;
            }else{
                sum-=c[i];
                ans++;
            }
        }
        if(flag==1){
            System.out.println(ans);
        }else{
            if(sum<=m)
                System.out.println(ans);
            else
                System.out.println("-1");
        }
        
    }
    static void shuffleArray(long[] arr){
            int n = arr.length;
            Random rnd = new Random();
            for(int i=0; i<n; ++i){
                long tmp = arr[i];
                int randomPos = i + rnd.nextInt(n-i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }   
    }
}
