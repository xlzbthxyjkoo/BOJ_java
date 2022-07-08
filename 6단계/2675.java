

import java.util.*;
import java.io.*;
    
public class Main {
  
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    int n1 = fr.nextInt(); //테스트 케이스
    
    for(int i = 0; i <n1; i++) {
      int n2 = fr.nextInt(); //문자 반복 
      String str = fr.next();  //문자열 입력

      
      for(int j = 0; j<str.length(); j++) {
        for(int k = 0; k<n2; k++) {
          System.out.print(str.charAt(j));
        }
      }
      System.out.println();
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
