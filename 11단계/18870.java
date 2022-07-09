/*중복되는 순위는 같은 순위, 값이 작을 수로 우선순위  rank */
/*시간 초과 에러 -> StringWriter, Bufferwriter로 해결) */

import java.util.*;
import java.io.*;


public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    StringWriter stringWriter = new StringWriter();
    BufferedWriter buffWriter = new BufferedWriter(stringWriter);
    

    int n = fr.nextInt(); // 표본의 개수

    ArrayList<Integer> org = new ArrayList<Integer>();  //원본배열
    ArrayList<Integer> str = new ArrayList<Integer>();  //정렬배열

    
    
    HashMap<Integer, Integer> rankary = new HashMap<Integer, Integer>();	// rank를 매길 HashMap

    for (int i = 0; i < n; i++) {
      int num = fr.nextInt(); //x좌표
      org.add(num); // 원본배열에 add
      str.add(num); // 원본배열에 add
    }

    Collections.sort(str); // sorting

    int rank = 0; //인덱스
    for(int i: str) {
      //정렬된 배열을 map에 하나씩 추가하면서 rank 매기기

      if(!rankary.containsKey(i)) { //원소가 이미 순회하였는지 확인해야 한다.
        rankary.put(i, rank); //map에 원소와 그에 대응하는 순위 넣어주기
        rank ++; //다음 rank로 갈 수 있도록 함
      }
    }


    // 원본 배열을 차례대로 순회하면서 해당 원소에 대한 rank를 갖고온다.
    for(int i: org) {
      int ranking = rankary.get(i);
      buffWriter.write(ranking + " ");
    }    
    buffWriter.flush();
    System.out.println(stringWriter.getBuffer());
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
