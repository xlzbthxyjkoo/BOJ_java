class Solution {
    //d=0과 같은 의미 
    static int x = 0, y = 0, d = 1000000;
    
    //상우하좌
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};
    
    public int[] solution(String command) {
        for(int i = 0; i < command.length(); i++) {
            String str = String.valueOf(command.charAt(i));
            //R,L의 경우 방향만 바꿔줌
            if(str.equals("R")){
                d++;
            }
            //전진, 후진
            else if(str.equals("L")) {
                d--;
            }
            else if(str.equals("G")) {
                x += dx[d % 4];
                y += dy[d % 4];
            }
            else if(str.equals("B")) {
                x -= dx[d % 4];
                y -= dy[d % 4];
            }
        }
        int[] answer = {x, y};
        return answer;
    }
}
