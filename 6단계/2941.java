import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader();

    String str = fr.next(); //문자열 입력받기
    int count = 0; //알파벳 개수

    for(int i = 0; i < str.length(); i++) {
      
      char ch = str.charAt(i);

      if(ch == 'c' && i < str.length() - 1) {	

				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					//c-, c=처럼 두개가 하나의 문자 -> i+1로 건너뛰기
					i++;		
				}
				
			}
		    
			else if(ch == 'd' && i < str.length() - 1) {
				
        if(str.charAt(i + 1) == '-') {	// d-
						i++;
			}
          
				else if(str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					
					if(str.charAt(i + 2) == '=') {	// dz=
						i += 2;
					}
				}
			}
		    
			else if((ch == 'l' || ch == 'n') && i < str.length() - 1) {
				if(str.charAt(i + 1) == 'j') {	// lj 또는 nj 일 경우
					i++;
				}
			}
		    
 
			else if((ch == 's' || ch == 'z') && i < str.length() - 1) {
				if(str.charAt(i + 1) == '=') {	// s= 또는z= 일 경우
					i++;
				}
			
		}
		    
			count++;
 
		}
    System.out.println(count);

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
