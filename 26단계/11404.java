import java.util.*;

public class Main {

  public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
  // 노드의 개수(N:도시의 개수), 간선의 개수(M:버스의 개수)
  public static int n, m;

  // 2차원 배열을 만듦
  public static int[][] graph = new int[101][101];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();

    // 최단 거리 테이블을 모두 무한으로 초기화
    for (int i = 0; i < 101; i++) {
      Arrays.fill(graph[i], INF);
    }

    // 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
    for (int a = 1; a<= n; a++) {
      for (int b = 1; b <= n; b++) {
        if (a == b)
          graph[a][b] = 0;
      }
    }

    // 각 간선에 대한 정보를 입력 받아, 그 값으로 초기화
    for (int i = 0; i < m; i++) {
      // A에서 B로 가는 비용은 C라고 설정
      int a = sc.nextInt(); // 시작도시
      int b = sc.nextInt(); // 도착도시
      int c = sc.nextInt(); // 한번 타는데 필요한 비용

      // 가장 짧은 간선 정보만 저장
      if (c < graph[a][b])
        graph[a][b] = c;
    }

    // 점화식에 따라 플로이드 워셜 알고리즘을 수행
    for (int i = 1; i <= n; i++) {
      for (int a = 1; a <= n; a++) {
        for (int b = 1; b <= n; b++) {
          graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
        }
      }
    }

    // 수행된 결과를 출력
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        // 도달할 수 없는 경우, 0을 출력
        if (graph[i][j] == INF) {
          System.out.print(0 + " ");
        }
        // 도달할 수 있는 경우 거리를 출력
        else {
          System.out.print(graph[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}
