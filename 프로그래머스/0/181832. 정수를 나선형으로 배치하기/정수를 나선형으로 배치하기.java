class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        
        answer = new int[n][n];
        
        int num = 0;
        int colStart = 0;
        int colEnd = n - 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        
        while (num < n * n) {
            for (int col = colStart; col <= colEnd; col++) {
                answer[rowStart][col] = ++num;
            }
            
            rowStart++;
            
            for (int row = rowStart; row <= rowEnd; row++) {
                answer[row][colEnd] = ++num;
            }
            
            colEnd--;
            
            for (int col = colEnd; col >= colStart; col--) {
                answer[rowEnd][col] = ++num;
            }
            
            rowEnd--;
            
            for (int row = rowEnd; row >= rowStart; row--) {
                answer[row][colStart] = ++num;
            }
            
            colStart++;
            
        }
        
        return answer;
    }
}