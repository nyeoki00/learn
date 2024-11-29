import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> targets = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String target = i + "";
            target = target.replace("5", "").replace("0", "");
            
            if (target.isEmpty()) {
                targets.add(i);
            }
        }
        
        answer = targets.isEmpty() ? new int[] {-1} : targets.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}