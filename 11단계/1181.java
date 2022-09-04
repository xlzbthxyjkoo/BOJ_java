import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드

    int N = fr.nextInt();  //단어의 개수

    String voca[] = new String[N];    

    for(int i = 0; i < N; i++) {
      voca[i] = fr.next();
    }
    //길이가 같을 경우 -> 사전 순
    //같은 단어는 한번씩만

    Arrays.sort(voca, new Comparator<String>() {
      public int compare(String o1, String o2) {
        if(o1.length() == o2.length()) {   //길이가 같을 경우
          return o1.compareTo(o2);  //사전순 compareTo사용
          
        }
        else {
          return o1.length() - o2.length();
        }
      }
    }); 

    System.out.println(voca[0]);
    //반복된 단어인지 비교를 위해 for문을 1부터 시작하기 때문에 0번 배열은 따로 출력해줘야함
    
    for(int i = 1; i < N; i++) {  
      //==,!= 안먹힘 equals 사용해야함
      if(!voca[i].equals(voca[i-1])) {
        System.out.println(voca[i]);
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
