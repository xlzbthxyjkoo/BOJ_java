import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        char quotes = '\u0022';
      
        System.out.println("         ,r'"+ quotes + "7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. "+ quotes + ". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
      

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
