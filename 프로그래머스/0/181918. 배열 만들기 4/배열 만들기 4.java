import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Deque<Integer> targets = new ArrayDeque<>();
        
        for (int num : arr) {
            if (targets.isEmpty()) {
                targets.addLast(num);
            } else {
                while (!targets.isEmpty() && targets.peekLast() >= num) {
                    targets.removeLast();
                }
                
                targets.addLast(num);
            }
        }
        
        stk = targets.stream().mapToInt(i -> i).toArray();
        
        return stk;
    }
}