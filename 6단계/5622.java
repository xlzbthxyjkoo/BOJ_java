/*0은 어케 하는거지...? */

import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    String str = fr.next(); //문자열 입력받기
    int count = 0; //소요 시간 측정

    for(int i = 0; i < str.length(); i++) {
      switch(str.charAt(i)) {
        case 'A': case 'B': case 'C':
          count += 3;
          break;

        case 'D': case 'E': case 'F':
          count += 4;
          break;

        case 'G': case 'H': case 'I':
          count += 5;
          break;

        case 'J': case 'K': case 'L':
          count += 6;
          break;

        case 'M': case 'N': case 'O':
          count += 7;
          break;

        case 'P': case 'Q': case 'R': case 'S':
          count += 8;
          break;

        case 'T': case 'U': case 'V':
          count += 9;
          break;

        case 'W': case 'X': case 'Y': case 'Z':
          count += 10;
          break;
          
      }
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
