import java.util.*;
import java.io.*;

public class Main {
  
  static int zero;
	static int one;
	static int sum;
    
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int T = Integer.parseInt(br.readLine());  //test case
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);			
			sb.append(zero).append(' ').append(one).append('\n');
		}
		System.out.println(sb);
 
	}
 
	public static void fibonacci(int N) {

		zero = 1;
		one = 0;
		sum = 1;
 
		for (int i = 0; i < N; i++) {
			zero = one;
			one = sum;
			sum = zero + one;
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
