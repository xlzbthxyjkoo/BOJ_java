
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();
    
    ArrayList<String> ary1 = new ArrayList<String>();

    int num1 = fr.nextInt();
    int num2 = fr.nextInt();

    int reverse1 = 0;
    int reverse2 = 0;

    while(num1!=0) {
      int digit = num1 % 10;  //맨뒷자리
      reverse1 = reverse1 * 10 + digit; 
      num1 /= 10;
    }

    while(num2!=0) {
      int digit = num2 % 10;
      reverse2 = reverse2 * 10 + digit;
      num2 /= 10;
    }

    if(reverse1 > reverse2) {
      System.out.println(reverse1);
    }

    else if(reverse1 < reverse2) {
      System.out.println(reverse2);
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
