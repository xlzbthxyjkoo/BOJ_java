import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
 
        ArrayList<Integer> ary = new ArrayList<Integer>();
        int temp = 0;

        for(int i=0; i < 9; i++) {  //자연수 9개 입력 받기
          int num = fr.nextInt();
          ary.add(num);
        }
      
        int max = Collections.max(ary); //최대

        for (int j = 0; j <9; j++) {  //최대값의 위치 찾기
          if(ary.get(j) == max) {
            temp = j+1;
          }
        }

        System.out.println(max);
        System.out.println(temp);
        

    }
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
