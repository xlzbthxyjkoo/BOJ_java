import java.util.*;

//최단거리 -> bfs
class Solution {
    static ArrayDeque<int[]> Q;
    static int N, M;
    static boolean [][] visited;
    static int [][] arr;
    static int [] dr = {0, 0, 1, -1};
    static int [] dc = {1, -1, 0, 0};
    
    static boolean flag = false; //상대팀 진영에 도달할 방법이 있는지 확인
    static int dist = 0;
    
    static void bfs() {
        Q = new ArrayDeque<>();
        Q.addLast(new int[] {0, 0}); //시작점
        visited[0][0] = true;
        
        while(!Q.isEmpty()) {
            int size = Q.size();
            
            for(int i = 0; i <size; i++) {
                int [] cur = Q.removeFirst();
                int cur_r = cur[0];
                int cur_c = cur[1];
                
                //상대 진영으로 도달한 경우(상대 진영은 가장 끝 좌표임)
                if(cur_r == N-1 && cur_c == M-1) {
                    flag = true;
                    Q.clear();
                    break;
                }
                
                for(int j = 0; j < 4; j ++) {
                    int nr = cur_r + dr[j];
                    int nc = cur_c + dc[j];
                    
                    //맵 밖이거나
                    if(nr < 0 || nr >= N || nc < 0 || nc >= M) {
                        continue;
                    }
                    //벽이거나(0: 벽이 있는 자리) || 이미 방문했거나
                    if(arr[nr][nc] == 0 || visited[nr][nc]) {
                        continue;
                    }
                    visited[nr][nc] = true;
                    Q.addLast(new int[] {nr, nc});
                }
            }
            dist++;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        arr = maps;
        N = maps.length;
        M = maps[0].length;
        visited = new boolean [N][M]; //false로 초기화
        bfs();
        answer = flag ? dist : -1;
        return answer;
    }
}
