import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        Set<Integer> targets = new HashSet<>();
        
        for (int i = max - min + 1; i <= max; i++) {
            targets.add(i);
        }
        
        for (int i = max + 1; i < max + min; i++) {
            targets.add(i);
        }
        
        answer = targets.size();
        
        return answer;
    }
}