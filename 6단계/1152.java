
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    // FastReader fr = new FastReader();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str[] = br.readLine().split(" "); // 문자열 입력

    int count = str.length;

    // 단어가 없으면 마이너스
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals(""))
        count--;
    }

    System.out.println(count);
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
