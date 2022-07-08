/*
[문제 설명]
X의 각 자릿수가 등차수열을 이룬다면, "한수"
1부터 N까지의 모든 "한수"를 출력하는 문제

[풀이 방법]
* x가 100 미만이라면, 전부 한수
* x가 100 이상 1000 미만이라면, 등차수열인지 계산해봐야 앎
* x가 1000이라면, 한수 아님
*/

import java.util.*;
import java.io.*;
    
public class Main {

  public static boolean checknum(int num) { //한수는 true

    if(num < 100) { //전부 한수
      return true;
    }

    else if(100 <=num && num < 1000) {  //등차수열인지 검사
      int n1 = num % 10; //일의자리
      int n2 = (num/10) % 10; //십의자리
      int n3 = num/100; //백의자리

      if(n1-n2 == n2-n3) {
        return true;
      }
      else 
        return false;
    }

    else //1000인 경우
      return false;

  }
  
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    int n = fr.nextInt(); //사용자 입력
    int count = 0;

    for (int i = 1; i<= n; i++) {
      if(checknum(i))  //true이면 카운트 +1
        count++;
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
