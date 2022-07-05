import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

        int a = fr.nextInt();
        int b = fr.nextInt();
        int c = fr.nextInt();

        if(a==b && b==c && a==c) {  //모두 같은 눈
          System.out.println(10000+(a*1000));
        }

        else if(a==b || a==c) {  //같은 눈 2개
          System.out.println(1000+(a*100));
        }

        else if(b==c) {  //같은 눈 2개
          System.out.println(1000+(b*100));
        }

        else {   
          System.out.println(Math.max(a,Math.max(b, c))*100);

        }
    }
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
