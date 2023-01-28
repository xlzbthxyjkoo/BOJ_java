import java.util.*;
import java.io.*;

public class Main {

   static int cnt1 = 0;
   static int cnt2 = 0;
   static int ary[];
  
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); 

    int n = fr.nextInt(); 
    ary = new int[n]; //DP위해서 만들어두기

    fib(n);
    fibonacci(n);

    System.out.println(cnt1);
    System.out.println(cnt2);

  }

  //피보나치 수 재귀호출 
  public static int fib(int n) {
    if(n == 1 || n == 2) {
      cnt1++;
      return 1;
    }
    return fib(n-1) + fib(n-2);
  }

  //피보나치 수 동적프로그래밍
  public static int fibonacci(int n) {
     ary[0] = 1;
     ary[1] = 1;
    for (int i = 2; i < n; i++) {
      cnt2++;
      ary[i] = ary[i-2] + ary[i-1];
    }
    return ary[n-1];
  }

  public static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastReader(String s) throws FileNotFoundException {
      br = new BufferedReader(new FileReader(new File(s)));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
