/* 찾은 규칙: 각 대각선 분수의 (분자+분모)값 동일
   홀수행이면 오른쪽 위쪽 방향으로 진행 / 분자 감소, 분모 증가
   짝수행이면 왼쪽 아래 방향으로 진행 / 분자 증가, 분모 감소 */

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int X = fr.nextInt();

    // 몇번째 대각선인지 찾기 위해
    int k = 1;
    int cnt = 0;

    while (cnt < X) {
      // 1 3(1+2) 6(3+3) 10(6+4)...
      cnt += k;
      k++;
    }

    if ((k - 1) % 2 == 0) {  //짝수행일때
      //분자/분모 출력
      //분자: (행에 존재하는 총 칸의 수 - 1) - (사용자가 찾고자 하는 값이 존재하는 수열의 값 - 사용자가 찾고자 하는 값)
      //분모: 1 + (사용자가 찾고자 하는 값이 존재하는 수열의 값 - 사용자가 찾고자 하는 값)
      System.out.println(((k - 1) - (cnt - X)) + "/" + (1 + (cnt - X)));
    }

    else { //홀수행일때
      //분자/분모 출력
      //짝수인 경우와 반대로
      System.out.println((1 + (cnt - X)) + "/" + ((k - 1) - (cnt - X)));
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
