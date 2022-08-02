/*
k층 n호 
-> (k-1)층의 1호 ~ n호까지 사람 수 데려와서 살아야함

0층부터 존재, 0층의 i호에는 i명

0층 1호 = 1명
0층 2호 = 2명
0층 3호 = 3명

1층 1호 = 1명(1)
1층 2호 = 3명(1+2)
1층 3호 = 6명(1+2+3)

2층 1호 = 1명(1)
2층 2호 = 4명(1+3)
2층 3호 = 10명(1+3+6)

->1호는 1명
->예를 들어 2층 2호이면 2층 1호+1층 2호
즉, (k층 n호이면 k층 n-1호 + k-1층 n호)
*/
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

        int[][] ary = new int[15][15]; //n <= 14
        
      for(int i = 0; i < 15; i++){  //배열 초기화
          ary[0][i] = i; //0층의 i호에는 i명
          ary[i][1] = 1; //각층 1호는 무조건 1명
        }

      for(int i = 1; i < 15; i++){ //1층부터 14층 채워주기
        for(int j = 2; j < 15; j++){  //2호부터 14호 채워주기
          ary[i][j] = ary[i][j-1] + ary[i-1][j];
        }
      }
      
        int T = fr.nextInt(); //Test Case
      
        for(int i = 0; i < T; i++){
          int k = fr.nextInt(); //k층
          int n = fr.nextInt(); //n호
          System.out.println(ary[k][n]);         
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
