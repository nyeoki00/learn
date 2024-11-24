import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        List<Integer> targets = new ArrayList<>();
        
        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                targets.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                targets.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                targets.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i <= b; i += c) {
                targets.add(num_list[i]);
            }
        }
        
        answer = targets.stream()
                        .mapToInt(i -> i)
                        .toArray();
        
        return answer;
    }
}