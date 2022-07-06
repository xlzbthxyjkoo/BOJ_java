import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

      
        int n = fr.nextInt();  //표본
        int students; //학생수
        int score; //점수
      

        for(int i =0; i < n; i++) {
          ArrayList<Integer> ary = new ArrayList<Integer>();
          int sum = 0; //총합
          float avg = 0; //평균
          int goodstu = 0 ; //평균이상 학생
          
          students = fr.nextInt();

          for(int j = 0; j<students; j++) {
            score = fr.nextInt();
            ary.add(score);
            sum += score;
          }
          avg = sum / students;

          for(int k = 0; k <ary.size(); k++) {
            if(ary.get(k) > avg) {
              goodstu++;            
            }
          }  
          System.out.println(String.format("%.3f", (double)goodstu/(double)students*100) + "%");
          
        }


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
