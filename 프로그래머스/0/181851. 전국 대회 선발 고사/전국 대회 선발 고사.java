import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer, Integer> targets = new TreeMap<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                targets.put(rank[i], i);
            }
        }
        
        int pow = 4;
        
        for (int key : targets.keySet()) {
            int idx = targets.get(key);
            
            if (pow >= 0) {
                answer += (int) Math.pow(10, pow) * idx;
                pow -= 2;
            }
        }
        
        return answer;
    }
}