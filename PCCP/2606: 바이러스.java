// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int V, E; //노드, 간선의 수
    static boolean[] visited; //방문한 노드는 true로 지정
    static int startNode = 1; //1번 컴퓨터로부터 감염된 컴퓨터를 찾기 때문에 1
    static ArrayList<Integer>[] arr; //인접리스트 사용
    
    static int cnt = -1; //감염된 컴퓨터 개수 - 1번 컴퓨터는 빼야해서 초기값 -1
    
	public static void main (String[] args) throws java.lang.Exception {
	    V = Integer.parseInt(br.readLine());
	    E = Integer.parseInt(br.readLine());
	    
	    visited = new boolean[V+1];
	    
	    arr = new ArrayList[V+1];
	    for(int i = 0; i < V+1; i++) {
	        arr[i] = new ArrayList<>();
	    }
	    
	    for(int i = 0; i < E; i++) {
	        st = new StringTokenizer(br.readLine());
	        int start = Integer.parseInt(st.nextToken());
	        int end = Integer.parseInt(st.nextToken());
	        arr[start].add(end);
	        arr[end].add(start);
	    }
	    
	    //DFS 사용
	    ArrayDeque<Integer> stack = new ArrayDeque<>(Arrays.asList(startNode));
	    
	    while(!stack.isEmpty()) {
	        int current = stack.removeLast();
	        if(!visited[current]) {
	            visited[current] = true;
	        }
	        
	        for(Integer destination : arr[current]) {
	            if(!visited[destination]) {
	                stack.addLast(destination);
	            }
	        }
	    }
	    for(int i = 0; i < visited.length; i++) {
	        if(visited[i]) {
	            cnt++;
	        }
	    }
	    System.out.print(cnt);
	}
}
