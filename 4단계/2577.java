import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
 
        ArrayList<Integer> ary = new ArrayList<Integer>();
        int A = fr.nextInt();
        int B = fr.nextInt();
        int C = fr.nextInt();

        int result = A*B*C;  //숫자 3개 곱셈

        while(result > 0) {  //곱셈의 결과 각 자릿수 분해
          ary.add(result % 10);  //1의 자리부터 차례로 각각 배열에 저장됨
          result /= 10;
        }

        int frequency0 = Collections.frequency(ary, 0);
        System.out.println(frequency0);

        int frequency1 = Collections.frequency(ary, 1);
        System.out.println(frequency1);

        int frequency2 = Collections.frequency(ary, 2);
        System.out.println(frequency2);

        int frequency3 = Collections.frequency(ary, 3);
        System.out.println(frequency3);

        int frequency4 = Collections.frequency(ary, 4);
        System.out.println(frequency4);

        int frequency5 = Collections.frequency(ary, 5);
        System.out.println(frequency5);

        int frequency6 = Collections.frequency(ary, 6);
        System.out.println(frequency6);

        int frequency7 = Collections.frequency(ary, 7);
        System.out.println(frequency7);
      
        int frequency8 = Collections.frequency(ary, 8);
        System.out.println(frequency8);
      
        int frequency9 = Collections.frequency(ary, 9);
        System.out.println(frequency9);

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
