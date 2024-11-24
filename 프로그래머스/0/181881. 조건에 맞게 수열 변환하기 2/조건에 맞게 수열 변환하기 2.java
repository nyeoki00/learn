import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] befores = {};
        int[] targets = new int[arr.length];
        
        while (!Arrays.equals(befores, targets)) {
            befores = answer == 0 ? Arrays.copyOf(arr, arr.length)
                                    : Arrays.copyOf(targets, targets.length);
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }

                targets[i] = arr[i];
            }
            
            answer++;
        }
        
        answer--;
        
        return answer;
    }
}