
import java.util.*;
import java.io.*;
    

public class Main {

  public static int selfnum(int num) {
    int sum = num;

    while (num != 0) {
      sum = sum + (num%10); //일의 자리부터 더해준다
      num /= 10; //일의 자리수 없애기
    }
    return sum; 
  }
  
  public static void main(String[] args) throws IOException {
    // FastReader fr = new FastReader();

    boolean[] check = new boolean[10001];

    for(int i=0; i<10001;i++) {
      int n = selfnum(i);

      if(n < 10001) {
        check[n] = true;  //return된 수는 생성자가 있는 수 즉, selfnum이 아니기 때문에 해당 위치를 true로 바꿔준다.
      }
    }

    for(int j = 0; j <10001;j++) {
      if(!check[j]) { //false만 출력
        System.out.println(j);
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
