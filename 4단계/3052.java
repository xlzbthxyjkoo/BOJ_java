/* HashSet: 자바 Collection 중 Set 의 파생클래스
1.중복되는 원소를 넣을 경우 하나만 저장 -> 중복원소를 허용하지 않음
2.순서 개념이 없다. -> Collections.sort() 메소드를 사용할 수 없다. 정렬을 하고 싶다면 리스트로 변환 후 정렬 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        HashSet<Integer> ary = new HashSet<Integer>();

        for(int i = 0; i <10; i++) {
              ary.add(Integer.parseInt(br.readLine()) % 42);  //42로 나눈 나머지 배열에 추가               
        }

       System.out.println(ary.size());

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
