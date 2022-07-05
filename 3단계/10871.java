import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

        int a = fr.nextInt();  //수열의 개수
        int b = fr.nextInt();  //b보다 작은 수 찾기
        ArrayList<Integer> ary = new ArrayList<Integer>();

        for(int i=0; i < a; i++) {
          int num = fr.nextInt();
          ary.add(num);
        }

        for(int j=0; j < ary.size(); j++) {
          if(ary.get(j) < b) {
            System.out.print(ary.get(j));
            System.out.print(" ");
          }
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
