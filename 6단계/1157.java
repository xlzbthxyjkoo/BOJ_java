

import java.util.*;
import java.io.*;
    
public class Main{
  
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    int ary[] = new int[26]; //알파벳 빈도 저장

    String str = fr.next();  //문자열 입력
    
    for(int i = 0; i <str.length(); i++) {
      if('A'<=str.charAt(i) && str.charAt(i)<= 'Z') { //대문자
        ary[str.charAt(i) - 'A']++; //해당하는 인덱스 1증가 시키기 
      }

      else{
        ary[str.charAt(i) - 'a']++;
      }
    }

    int max = 0; 
    char ch = '?';

    for(int j = 0; j < ary.length; j++) {
      if(ary[j] > max) {
        max = ary[j];
        ch = (char)(j + 65); //대문자로 출력
      }

      else if(ary[j]==max) {
        ch = '?';
      }      
    }
    System.out.println(ch);

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
