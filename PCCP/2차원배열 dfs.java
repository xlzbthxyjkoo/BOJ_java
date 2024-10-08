//다음과 같은 마을의 지도 데이터가 있을 때, 사람이 살고있는 집이 1이고 비어있는 집이 0이라고 가정합니다.  
//상 하 좌 우 4방향으로 집이 이어져있다면, 
//그 이어진 집들의 수만큼 한 마을의 사이즈가 결정됩니다. 지도가 주어졌을 때, 마을들의 최대 크기를 구하시오.
// 답 13
//7
//0 0 0 0 0 1 1
//0 0 0 0 0 0 0
//0 0 1 1 1 0 0
//0 0 1 0 1 1 1
//0 1 1 0 0 1 0
//0 0 1 1 1 0 0
//0 0 0 0 0 0 0
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N; //가로, 세로 크기
    static int [][] arr; //지도
    //방향은 어떻게 설정하더라도 상관 없음
    static int [] dr = {1, 0, -1, 0};
    static int [] dc = {0, 1, 0, -1};
    static ArrayDeque<int[]> stack;
    static int answer = 0; //max가 될 수 있는 값

    static int dfs(int r, int c) {
        int cnt = 1;
        arr[r][c] = 0;
        stack = new ArrayDeque<>();
        stack.addLast(new int[] {r,c}); //스택에 맨 처음 값 넣고 시작

        while(!stack.isEmpty()) {
            //cur에 좌표가 들어가게 된다
            int [] cur = stack.removeLast();
            int cur_r = cur[0];
            int cur_c = cur[1];

            //4방 탐색
            for(int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                //맵 밖으로 벗어나거나 0이거나
                if(nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] == 0) {
                    continue;
                }

                stack.addLast(new int[] {nr, nc});
                arr[nr][nc] = 0; //탐색 한 자리를 0으로 만들고
                cnt++; //마을 하나 찾았다고 기록
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int [N][N];

        //2차원 배열 저장
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        //1이 있으면 dfs 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                //1발견하면 dfs 돌려서 최댓값 갱신
                if(arr[i][j] == 1) {
                    answer = Math.max(answer, dfs(i, j));
                }
            }
        }
        System.out.println(answer);
    }
}
