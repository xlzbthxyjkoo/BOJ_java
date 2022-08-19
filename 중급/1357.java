import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int sum = 0;

    // reverse를 위해 문자열 형태로 입력 받기
    String a = fr.next();
    String b = fr.next();

    a = new StringBuffer(a).reverse().toString(); // a reverse
    b = new StringBuffer(b).reverse().toString(); // b reverse

    int reversed_a = Integer.parseInt(a); // 덧셈을 위해 int 형으로 변환
    int reversed_b = Integer.parseInt(b); // 덧셈을 위해 int 형으로 변환

    sum = reversed_a + reversed_b;

    String strsum = Integer.toString(sum); // sum 뒤집기 위해 string으로 변경

    String reversed_sum = new StringBuffer(strsum).reverse().toString(); // 결과 뒤집기

    int intsum = Integer.parseInt(reversed_sum);

    System.out.println(intsum);

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
