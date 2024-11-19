class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        
        answer = new int[] {0, 0};
        int xLimit = (board[0] - 1) / 2;
        int yLimit = (board[1] - 1) / 2;
        
        for (String key : keyinput) {
            int x = answer[0];
            int y = answer[1];
            
            if (key.equals("left")) {
                answer[0] = x > -xLimit ? x - 1 : x;
            }
            
            if (key.equals("right")) {
                answer[0] = x < xLimit ? x + 1 : x;
            }
            
            if (key.equals("down")) {
                answer[1] = y > -yLimit ? y - 1 : y;
            }
            
            if (key.equals("up")) {
                answer[1] = y < yLimit ? y + 1 : y;
            }
        }
        
        return answer;
    }
}