import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FastReader fr = new FastReader(); 
    
    int N = fr.nextInt();  //컨베이어 길이(총 길이는 2N)
    int K = fr.nextInt();  //종료조건:내구도가 0인 칸이 k개 이상
    int[] A = new int[2*N]; //컨베이어 벨트의 길이 만큼 내구도

    for(int i = 0; i < 2*N; i++) {
      A[i] = fr.nextInt();  //내구도 배열에 저장
    }

    int result = belt(A, N, K);
    
    System.out.println(result);
  }

  public static int belt(int[] A, int N, int K) {
    int zero = 0; //내구도가 0인 칸
    int step = 0; //단계

    Queue<Integer> q = new LinkedList<>(); //로봇 이동을 위한 큐
    boolean[] robot = new boolean[2*N]; // 현재 위치에 로봇이 있는지 판단

    while(zero < K) {  // 내구도가 0인 칸이 K개 미만일때
      step++;
      int robot_cnt = q.size(); //size별로 수행  
      
      //1. 벨트 한칸 회전
			int pre = A[2*N-1]; // 가장 끝 
			for(int i = 0; i < 2*N; i++) { // 한칸씩 앞으로 이동하며 갱신
				int cur = A[i];
				A[i] = pre;
				pre = cur;
			}
      // 로봇위치도 이동, 여기서 내려가는 위치라면 Queue에서 빼준다.
			int cnt = 0;
			
      while(robot_cnt > cnt) {
				cnt++;
				int pos = q.poll();
				robot[pos] = false;
				int next_pos = (pos+1)%(2*N);
				if(next_pos == N) continue; // 내려가는 위치라면 큐에 넣지않는다.
				q.offer(next_pos);
				robot[next_pos] = true;
			}
      // 위에서 큐의 길이에 변동이 생겼을 수도 있다
			robot_cnt = q.size();
			
      //2. 이동 시킬 로봇이 있다면 이동. 내려가는 위치에 도착하면 Queue에서 뺀다
			if(robot_cnt != 0) {
				cnt = 0;
				while(robot_cnt > cnt) {
					cnt++;
					int pos = q.poll();
					robot[pos] = false;
					int next_pos = (pos+1)%(2*N);
					if(next_pos == N) continue;
					// 벨트의 내구도가 남아있고, 로봇이 없는 상태.
					if(A[next_pos] != 0 && !robot[next_pos]) {
						if(--A[next_pos] == 0) {
							++zero;
						}
						
						q.offer(next_pos);
						robot[next_pos] = true;
					} 
          
          else { // 이동 불가능한 상태
						q.offer(pos);
						robot[pos] = true;
					}
				}
			}
			
			// 3. 로봇을 하나 올린다. 0번 자리에 내구도가 남아있고, 로봇이 없는 경우
			if(A[0] != 0 && !robot[0]) {
				q.offer(0);
				robot[0] = true;
				if(--A[0] == 0) {
					++zero;
				}
			}
		}
		return step;
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
