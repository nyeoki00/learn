class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int len = 1;
        
        while (len < arr.length) {
            len *= 2;
        }
        
        answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}