import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        int len = my_str.length();
        List<String> targets = new ArrayList<>();
        
        for (int i = 0; i < len; i = i + n) {
            int endIdx = Math.min(i + n, len);
            
            targets.add(my_str.substring(i, endIdx));
        }
        
        answer = targets.toArray(String[]::new);
        
        return answer;
    }
}