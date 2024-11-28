import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        answer = new int[k];
        
        List<Integer> targets = Arrays.stream(arr)
                                      .distinct()
                                      .boxed()
                                      .collect(Collectors.toList());
        
        for (int i = 0; i < answer.length; i++) {
            if (i >= targets.size()) {
                answer[i] = -1;
            } else {
                answer[i] = targets.get(i);
            }
        }
        
        return answer;
    }
}