import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
      
        int n = fr.nextInt();  //표본
        String str; //문자열 받기   

        for(int i =0; i < n; i++) {
          str = fr.next();
          int sum = 0; //합 -> 매 테스트 케이스 마다 초기화 되어야함
          int count = 0; //연속 -> ,,
          
          for(int j = 0; j <str.length(); j++) {
            if(str.charAt(j) == 'O') {
              count++;
              sum += count;
            }

            else {
              count = 0;
            }
          } 
          System.out.println(sum);
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
