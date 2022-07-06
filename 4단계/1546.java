import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
 
        ArrayList<Integer> ary = new ArrayList<Integer>();
        float newscore;
        float sum = 0;
        float avg;
      
        int n = fr.nextInt();  //시험 본 과목수

        for(int i =0; i < n; i++) {
          int score = fr.nextInt();
          ary.add(score);  //점수 배열에 저장
        }

        int max = Collections.max(ary); //점수가 가장 높은 과목    

        for(int j = 0; j < ary.size(); j++) {
            newscore = ary.get(j)/(float)max*100;
            sum += newscore;
        }   

        avg = sum / n;

        System.out.println(avg);

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
