import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        Stack<Integer> result = new Stack<>();
        
        for (int num : arr) {
            if (result.isEmpty()) {
                result.push(num);
            } else {
                if (num == result.peek()) {
                    result.pop();
                } else {
                    result.push(num);
                }
            }
        }
        
        answer = result.isEmpty() ? new int[] {-1} 
                   : result.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}