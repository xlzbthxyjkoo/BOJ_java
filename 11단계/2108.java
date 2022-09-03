/* 
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
*/

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int N = fr.nextInt(); // 입력하는 값 개수

    int ary[] = new int[N]; // 입력값 저장해두는 배열 생성

    for (int i = 0; i < N; i++) {
      ary[i] = fr.nextInt(); // 값 N개 입력받기
    }

    // 1. 산술평균 구하기
    double avg = 0; // 산술평균
    for (int i = 0; i < ary.length; i++) {
      avg += ary[i]; // 모두 더해주기
    }
    avg = avg / N;

    // 2. 중앙값 구하기 (N은 항상 홀수)
    int median = 0;
    Arrays.sort(ary); // 오름차순으로 정렬
    median = ary[N / 2];

    // 3. 최빈값 구하기
    boolean check = false; // 두번째로 작은 수 출력 위해
    int cnt = 0;
    int mode = ary[0];
    int max = -1; // 최대값을 저장하기 위한 변수
    for (int i = 0; i < ary.length - 1; i++) {
      if (ary[i] == ary[i + 1]) {
        cnt++;
      } else {
        cnt = 0;
      }

      if (max < cnt) {
        max = cnt;
        mode = ary[i];
        check = true;
      }

      else if (max == cnt && check == true) {
        mode = ary[i];
        check = false;
      }

    }

    System.out.println(Math.round(avg)); // Math함수의 round함수는 실수의 소수점 첫번째 자리를 반올림하여 정수로 리턴시켜준다.
    System.out.println(median);
    System.out.println(mode);
    System.out.println(ary[N - 1] - ary[0]);

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
