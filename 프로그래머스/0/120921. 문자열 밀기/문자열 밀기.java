import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        answer = -1;
        List<String> targets = Arrays.stream(A.split("")).collect(Collectors.toList());
        int endIdx = A.length() - 1;
        
        
        for (int i = 1; i < targets.size(); i++) {
            if (A.equals(B)) { 
                answer = 0;
                break; 
            }
            
            String endStr = targets.get(endIdx);

            targets.remove(endIdx);
            targets.add(0, endStr);
            
            String check = String.join("", targets);
            
            if (check.equals(B)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}