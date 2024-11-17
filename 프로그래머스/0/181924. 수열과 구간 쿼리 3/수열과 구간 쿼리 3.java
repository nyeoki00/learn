import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        answer = Arrays.copyOf(arr, arr.length);
        
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            
            int temp = answer[left];
            answer[left] = answer[right];
            answer[right] = temp;
        }
        
        return answer;
    }
}