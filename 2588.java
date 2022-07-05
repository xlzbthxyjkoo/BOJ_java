import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        int a = fr.nextInt();
        int b = fr.nextInt();

        int a1 = a / 100; //100의 자리
        int a2 = a % 100 / 10; //10의 자리
        int a3 = a % 100 % 10; //1의 자리 

        int b1 = b / 100; //100의 자리
        int b2 = b % 100 / 10; //10의 자리
        int b3 = b % 100 % 10; //1의 자리 

        System.out.println(a3*b3 + a2*b3*10 + a1*b3*100);
        System.out.println(a3*b2 + a2*b2*10 + a1*b2*100);
        System.out.println(a3*b1 + a2*b1*10 + a1*b1*100);
        System.out.println((a3*b3 + a2*b3*10 + a1*b3*100) 
                           + (a3*b2 + a2*b2*10 + a1*b2*100)*10 
                          + (a3*b1 + a2*b1*10 + a1*b1*100)*100);

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
