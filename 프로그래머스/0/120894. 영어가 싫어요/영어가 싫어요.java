import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String result = numbers;
        
        Map<String, Integer> targets = new HashMap<>(){{
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
            put("zero", 0);
        }};
        
        for (String key : targets.keySet()) {
            result = result.replace(key, targets.get(key) + "");
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}