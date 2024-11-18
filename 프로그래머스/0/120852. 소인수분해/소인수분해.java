import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> targets = new ArrayList<>();
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                targets.add(i);
            }
        }
        
        if (targets.isEmpty()) {
            targets.add(n);
        }
        
        for (int i = 0; i < targets.size(); i++) {
            int target = targets.get(i);
            
            for (int j = 2; j <= target / 2; j++) {
                if (target % j == 0) {
                    targets.set(i, -1);
                    break;
                }
            }
        }
        
        answer = targets.stream()
                        .filter(i -> i != -1)
                        .distinct()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}