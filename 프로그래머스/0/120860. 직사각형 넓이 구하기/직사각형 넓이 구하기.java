class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int width = 0;
        int height = 0;
        int[] target = dots[0];
        
        for (int i = 1; i < dots.length; i++) {
            if (width != 0 && height != 0) { break; }
            
            if (width == 0) {
                width = Math.abs(target[0] - dots[i][0]);
            }
            
            if (height == 0) {
                height = Math.abs(target[1] - dots[i][1]);
            }
        }
        
        answer = width * height;
        
        return answer;
    }
}