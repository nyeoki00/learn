class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] checkBomb = new int[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int target = board[i][j];
                
                if (target == 1) {
                    int startX = i - 1 > 0 ? i - 1 : 0;
                    int endX = i + 1 < board.length ? i + 1 : board.length - 1;
                    int startY = j - 1 > 0 ? j - 1 : 0;
                    int endY = j + 1 < board[i].length ? j + 1 : board[i].length - 1;
                    
                    
                    for (int k = startX; k <= endX; k++) {
                        for (int l = startY; l <= endY; l++) {
                            checkBomb[k][l]++;
                        }
                    }
                }
            }
            
        }
        
        
        
        for (int[] floor : checkBomb) {
            for (int room : floor) {
                answer = room == 0 ? answer + 1 : answer;
            }
        }
        
        return answer;
    }
}