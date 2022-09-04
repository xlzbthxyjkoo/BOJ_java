import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int N = fr.nextInt();

    int point[][] = new int[N][2];

    for(int i = 0; i < N; i++) {
      point[i][0] = fr.nextInt();
      point[i][1] = fr.nextInt();
    }

    //arrays.sort를 확장시켜 정렬
    Arrays.sort(point, new Comparator<int[]>() {
      public int compare(int[] o1, int[] o2) {
        if(o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }

        else {
          return o1[1] - o2[1];
        }
      }
    });

    for(int i = 0; i < N; i++) {
      System.out.println(point[i][0] + " " + point[i][1]);
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
