

import java.util.*;
import java.io.*;
    
public class Main {
  
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    String str = fr.next();  //문자열 입력
    char start = 'a';
    
    for(int i = 0; i <26; i++) {
      System.out.print(str.indexOf((char)(start+i)) + " ");
      //indexOf(): 특정 문자나 문자열에서 해당하는 문자의 인덱스 값을 반환하고 찾지 못했을 경우 '-1'을 반환하는 메소드
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
