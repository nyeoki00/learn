import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        List<String> targets = Arrays.stream(myStr.split("[abc]"))
                                     .filter(s -> !s.isEmpty())
                                     .collect(Collectors.toList());
        
        answer = targets.isEmpty() ? new String[] {"EMPTY"} : targets.toArray(new String[0]);
        
        return answer;
    }
}