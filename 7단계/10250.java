import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int T = fr.nextInt(); // 테스트 케이스

    for (int i = 0; i < T; i++) {
      int H = fr.nextInt(); // 건물 높이
      int W = fr.nextInt(); // 건물 가로 길이
      int N = fr.nextInt(); // 손님 수

      if(N % H == 0) { //손님%층수 가 0이면 H층 N/H호 ex) n = 6, h =6 -> 601호 n = 12, h = 6 -> 602호 
        System.out.println((H*100) + (N/H));      
      }

      else {  //N%H층 N/H +1호
        System.out.println((N%H)*100 + (N/H + 1));
      }

    }

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
