import java.util.*;

//정렬 -> 시간초과 -> 힙 사용
class Solution {
    
    public int solution(int[] ability, int number) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        //값 뽑아서 힙에 넣기
        for(int value : ability) {
            minHeap.offer(value);
        }
        
        for(int i = 0; i < number; i++) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            for(int j = 0; j < 2; j++) {
                minHeap.offer(first + second);
            }
        }
        
        int answer = 0;
        for(int value : minHeap) {
            answer += value;
        }
        return answer;
    }
}
