
/* 
1. split(":")으로 시, 분, 초 구분하기
2. 임무 시작 시간에서 현재 시간 빼기

그냥 시간 초 단위로 합쳐서 빼고
다시 나눠서 출력
*/
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    String a = fr.next(); // 현재 시간
    String b = fr.next(); // 임무 시작시간

    String arr_a[] = a.split(":");  //구분
    String arr_b[] = b.split(":");  //구분

    int int_a[] = new int[arr_a.length];
    int int_b[] = new int[arr_b.length];

    for (int i = 0; i < arr_a.length; i++) {
      int_a[i] = Integer.parseInt(arr_a[i]);  //구분한 문자 숫자형으로 바꿔주기
      int_b[i] = Integer.parseInt(arr_b[i]);  //구분한 문자 숫자형으로 바꿔주기
    }

    int_a[0] = int_a[0] * 3600;
    int_a[1] = int_a[1] * 60;

    int_b[0] = int_b[0] * 3600;
    int_b[1] = int_b[1] * 60;

    int sum_a = 0;
    int sum_b = 0;
    int realsum = 0;

    for(int i = 0; i < arr_a.length; i++) {
      sum_a += int_a[i];
    }    

    for(int i = 0; i < arr_b.length; i++) {
      sum_b += int_b[i];
    } 

    if(sum_b > sum_a) {
      realsum = sum_b - sum_a;
    }
    else {
      realsum = (24 * 3600) - (sum_a - sum_b);
    }

    int hour = 0;
    int min = 0;
    int sec = 0;

    hour = realsum / 3600;
    realsum = realsum % 3600;
    
    min = realsum / 60;

    sec = realsum % 60;

    String hourstr = String.format("%02d", hour);
    String minstr = String.format("%02d", min);
    String secstr = String.format("%02d", sec);
    

    System.out.println(hourstr + ":" + minstr + ":" + secstr);
        

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
