import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> targets = new ArrayList<>();
        
        for (String str : intStrs) {
            String target = str.substring(s, s + l);
            int num = Integer.parseInt(target);
            if (num > k) {
                targets.add(num);
            }
        }
        
        answer = targets.stream()
                        .mapToInt(Integer :: intValue)
                        .toArray();
        
        return answer;
    }
}