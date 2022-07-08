/*fr.next() 같은 형식으로 사용자 입력 받을 시 런타임 에러 발생 -> readLine 사용하니까 해결*/
import java.util.*;
import java.io.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  FastReader fr = new FastReader();
  public static boolean check() throws IOException { // 그룹단어 체크 함수
    
    boolean[] alphabet = new boolean[26]; // Alphabet
    int c = 0; // 비교를 위한 알파벳(앞서 나온 알파벳)

    String str = br.readLine(); // 문자열 입력받기

    for (int i = 0; i < str.length(); i++) {
      int temp = str.charAt(i); // 현재 알파벳 저장

      if (c != temp) { // 앞 알파벳과 현재 알파벳이 같지 않을 경우
        if (!alphabet[temp - 'a']) { // false는 temp가 처음 나온 경우
          alphabet[temp - 'a'] = true; // true로 수정
          c = temp; // c 값 수정
        }

        else { // 앞서 나온 알파벳인 경우 -> 그룹단어 아님
          return false; // check 함수 종료
        }
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException {

    int n = Integer.parseInt(br.readLine()); // 표본
    int count = 0; // 그룹단어의 수

    for (int i = 0; i < n; i++) {
      if (check())
        count++; // true이면 count 1증가
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
