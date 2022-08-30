import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
      StringBuilder sb = new StringBuilder();
        
      int N = fr.nextInt();  //입력 받을 숫자 개수

      int ary[] = new int[N];  //숫자 입력 받을 배열
      
      for(int i = 0; i < N; i++) {
        ary[i] = fr.nextInt();  //배열에 숫자 저장
      }

      Arrays.sort(ary); //오름차순 정렬

      for(int i : ary) {
        sb.append(i).append("\n");
      }      

      System.out.println(sb);
        
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
