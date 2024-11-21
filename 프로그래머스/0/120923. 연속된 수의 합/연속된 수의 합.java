import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        
        List<Integer> nums = IntStream.rangeClosed(1, num)
                                      .boxed()
                                      .collect(Collectors.toList());
        int sum = nums.stream().mapToInt(i -> i).sum();
        
        while (sum != total) {
            
            if (sum < total) {
                nums = nums.stream().map(i -> i + 1).collect(Collectors.toList());
            } else {
                nums = nums.stream().map(i -> i - 1).collect(Collectors.toList());
            }
            
            sum = nums.stream().mapToInt(i -> i).sum();
            
        }
        
        answer = nums.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}